# 💱 Conversor de Moedas - Desafio Oracle ONE + Alura

[![Java](https://img.shields.io/badge/Java-21+-blue.svg)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Um conversor de moedas que obtém taxas de câmbio em tempo real através de API, 
desenvolvido em Java para o desafio técnico da Oracle ONE em parceria com Alura.

## 🌟 Funcionalidades

- Conversão monetária em tempo real com 6 opções:
    - USD → BRL (Dólar para Real Brasileiro)
    - BRL → USD (Real Brasileiro para Dólar)
    - USD → ARS (Dólar para Peso Argentino)
    - ARS → USD (Peso Argentino para Dólar)
    - USD → COP (Dólar para Peso Colombiano)
    - COP → USD (Peso Colombiano para Dólar)
- Interface textual intuitiva via console
- Atualização dinâmica das taxas de câmbio via API
- Validação de entradas do usuário
- Experiência de usuário fluida com confirmações visuais

## ⚙️ Tecnologias Utilizadas

- **Java 21+**
- **ExchangeRate-API** - Para obtenção das taxas de câmbio
- **Gson** - Para manipulação de respostas JSON
- **HttpClient** - Para requisições HTTP
- **Maven** - Gerenciamento de dependências

## 🔧 Pré-requisitos

- JDK 21 ou superior
- Maven 3.8+
- Chave de API gratuita do [ExchangeRate-API](https://www.exchangerate-api.com/)

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/geovanedias/desafio-conversor-moedas-alura.git
```

Configure sua chave de API:

  - Modifique em `/src/main/java/com/alura/conversor/Conversor.java`
  - Adicione: `API_KEY=sua_chave_api_aqui`

3. Compile e execute:

```bash
mvn clean package
java -jar target/conversor-moedas.jar
```

## 🖥️ Como Usar

1. Execute o programa
2. Selecione uma das opções de conversão:

```
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    Bem vindo/a ao conversor de moedas online!
    Digite a opção desejada:

    1- Dolar ⇒ Real Brasileiro
    2- Real Brasileiro ⇒ Dolar
    3- Dolar ⇒ Peso Argentino
    4- Peso Argentino ⇒ Dolar
    5- Dolar ⇒ Peso Colombiano
    6- Peso Colombiano ⇒ Dolar
    7- Sair
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
```

3. Digite o valor a ser convertido
4. Veja o resultado formatado:

`Valor convertido: 100.00 USD = 517.23 BRL`

5. O menu será exibido novamente para que você escolha realizar uma nova conversão ou caso deseje sair escolha a opção `7`.

## 🧩 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com.alura.conversor/
            ├── api/
            │   └── Conversor.java
            ├── menu/
            │   └── Menu.java
            └── Main.java
```

## ✅ Implementação do Desafio

### Passo a Passo Cumprido
1. Configuração do Ambiente Java
  - JDK 17 e Maven configurados
2. Criação do Projeto
  - Estrutura de pacotes organizada
  - Classes principais implementadas
3. Consumo da API
  - Integração com ExchangeRate-API
  - Tratamento de requisições HTTP
4. Análise da Resposta JSON
  - Uso do Gson para parse de respostas
  - Extração de dados de conversão
5. Filtro de Moedas
  - Mapeamento de opções para códigos ISO
  - Validação de entradas
6. Exibição de Resultados
  - Interface amigável em console
  - Formatação de valores monetários
  - Fluxo de operação contínuo

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](https://github.com/geovanedias/desafio-conversor-moedas-alura/blob/main/README.md) para detalhes.

---

Desenvolvido por Geovane Dias de Araujo como parte do desafio técnico da Alura pelo curso Oracle ONE.
