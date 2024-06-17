package conversor;

import java.util.Scanner;

public class Main {

    // ANSI escape codes for coloring output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.fetchRates();

        if (apiRequest.getConversionRates() == null) {
            System.out.println(ANSI_RED + "Erro ao carregar as taxas de câmbio. Encerrando o programa." + ANSI_RESET);
            return;
        }

        CurrencyConverter converter = new CurrencyConverter(apiRequest.getConversionRates());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(ANSI_CYAN + "Bem-vindo ao Conversor de Moedas!" + ANSI_RESET);
            System.out.println("1. Converter moeda");
            System.out.println("2. Mostrar códigos de moedas disponíveis");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite a moeda de origem (ex: USD): ");
                    String fromCurrency = scanner.next().toUpperCase();

                    System.out.print("Digite a moeda de destino (ex: BRL): ");
                    String toCurrency = scanner.next().toUpperCase();

                    System.out.print("Digite o valor a ser convertido: ");
                    double amount = scanner.nextDouble();

                    try {
                        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
                        System.out.println(ANSI_GREEN + "Valor convertido: " + convertedAmount + " " + toCurrency + ANSI_RESET);
                    } catch (IllegalArgumentException e) {
                        System.out.println(ANSI_RED + e.getMessage() + ANSI_RESET);
                    }
                    break;

                case 2:
                    System.out.println(ANSI_BLUE + "Códigos de moedas disponíveis:" + ANSI_RESET);
                    int count = 0;
                    for (String code : apiRequest.getConversionRates().keySet()) {
                        System.out.print(code + "\t");
                        count++;
                        if (count % 5 == 0) {
                            System.out.println();
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println(ANSI_PURPLE + "Encerrando o programa. Obrigado!" + ANSI_RESET);
                    scanner.close();
                    return;

                default:
                    System.out.println(ANSI_YELLOW + "Opção inválida. Tente novamente." + ANSI_RESET);
                    break;
            }
        }
    }
}2