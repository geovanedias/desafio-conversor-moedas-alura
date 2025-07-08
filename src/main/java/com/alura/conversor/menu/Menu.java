package com.alura.conversor.menu;

import com.alura.conversor.api.Conversor;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
        iniciarMenu();
    }

    private void exibirMenu() {
        String opcoesMenu = """
            %n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
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
            """.formatted();
        System.out.println(opcoesMenu);
    }

    private void iniciarMenu() {
        int escolha = 0;

        while (true) {
            exibirMenu();
            escolha = scanner.nextInt();

            if (escolha == 7) {
                break;
            }

            if (escolha < 1 || escolha > 7) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.print("\nDigite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            try {
                double resultado = 0;
                String moedaOrigem = "";
                String moedaDestino = switch (escolha) {
                    case 1 -> {
                        moedaOrigem = "USD";
                        yield "BRL";
                    }
                    case 2 -> {
                        moedaOrigem = "BRL";
                        yield "USD";
                    }
                    case 3 -> {
                        moedaOrigem = "USD";
                        yield "ARS";
                    }
                    case 4 -> {
                        moedaOrigem = "ARS";
                        yield "USD";
                    }
                    case 5 -> {
                        moedaOrigem = "USD";
                        yield "COP";
                    }
                    case 6 -> {
                        moedaOrigem = "COP";
                        yield "USD";
                    }
                    default -> "";
                };

                resultado = Conversor.converterMoeda(moedaOrigem, moedaDestino, valor);
                System.out.printf("%nValor convertido: %.2f %s = %.2f %s%n",
                    valor, moedaOrigem, resultado, moedaDestino);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}