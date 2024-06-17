## [Projeto Oracle e Alura] Praticando Java: Challenge Conversor de Moedas

# Conversor de Moedas

Bem-vindo ao Conversor de Moedas! Este projeto foi desenvolvido para oferecer uma experiência prática e emocionante no desenvolvimento Java. O conversor obtém taxas de câmbio em tempo real a partir de uma API e oferece um menu interativo com várias opções de conversões de moedas.

## Funcionalidades

- Consumo de uma API de taxas de câmbio em tempo real.
- Análise e manipulação de dados JSON.
- Filtro e exibição de moedas de interesse.
- Menu interativo com no mínimo 6 opções de conversões de moedas.
- Exibição das taxas de câmbio disponíveis.
- Conversão de valores entre diferentes moedas.

## API Utilizada
O projeto utiliza a API ExchangeRate-API para obter taxas de câmbio em tempo real. Esta API fornece informações precisas e atualizadas sobre as taxas de câmbio de várias moedas, facilitando a conversão de valores entre diferentes moedas no aplicativo.

## Estrutura do Projeto

O projeto está dividido nas seguintes classes principais:

1. **Main**: Classe principal que contém o método `main` e gerencia a interação com o usuário.
2. **ApiRequest**: Classe responsável por fazer as requisições HTTP à API de taxas de câmbio.
3. **CurrencyConverter**: Classe que realiza a conversão entre as moedas com base nas taxas obtidas da API.
4. **ApiResponse**: Classe que modela a resposta da API.

### Main

A classe `Main` é o ponto de entrada do programa. Ela gerencia a interação inicial com o usuário, exibe o menu de opções e chama os métodos apropriados para obter e exibir as taxas de câmbio. 

### ApiRequest

A classe `ApiRequest` é responsável por fazer as requisições HTTP à API de taxas de câmbio e retornar os dados em formato JSON. Ela encapsula a lógica de comunicação com a API.

### CurrencyConverter

A classe `CurrencyConverter` utiliza os dados fornecidos pela `ApiRequest` para realizar as conversões de moedas. Ela contém métodos para converter valores entre diferentes moedas com base nas taxas de câmbio dinâmicas.

### ApiResponse

A classe `ApiResponse` modela a resposta da API e facilita a extração dos dados relevantes.

## Passos para Completar o Desafio

1. **Configuração do Ambiente Java**
2. **Criação do Projeto**
3. **Consumo da API**
4. **Análise da Resposta JSON**
5. **Filtro de Moedas**
6. **Exibição de Resultados aos Usuários**

## Configuração do Ambiente Java

1. Baixe e instale o [JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Configure a variável de ambiente `JAVA_HOME`.
3. Verifique a instalação do Java com o comando:
    ```sh
    java -version
    ```

## Criação do Projeto

1. Crie um novo projeto Java em sua IDE preferida (Eclipse, IntelliJ, etc.).
2. Adicione as dependências necessárias no arquivo `pom.xml` (se estiver usando Maven) ou configure seu projeto de acordo com a estrutura desejada.

### Dependências Maven

Certifique-se de adicionar as dependências no seu arquivo `pom.xml`:

