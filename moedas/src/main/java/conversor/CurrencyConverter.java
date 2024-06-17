package conversor;

import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> conversionRates;

    public CurrencyConverter(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public double convert(String fromCurrency, String toCurrency, double amount){
        if(conversionRates == null || !conversionRates.containsKey(fromCurrency) || !conversionRates.containsKey(toCurrency)){
            throw new IllegalArgumentException("Moeda não suportada ou taxas de câmbio não carregadas.");
        }

        double rateFrom = conversionRates.get(fromCurrency);
        double rateTo = conversionRates.get(toCurrency);
        return amount * (rateTo / rateFrom);
    }
}
