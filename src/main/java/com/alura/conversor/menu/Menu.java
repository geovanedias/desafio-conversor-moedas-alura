package com.alura.conversor.menu;

import java.util.Scanner;

public class Menu {
    public Menu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        String opcoesMenu = """
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                    Bem vindo/a ao conversor de moedas online!
                    Digite a opção desejada:
                
                    1- Dolar ⇒ Real Brasileiro
                    2- Real ⇒ Brasileiro
                    3- Dolar ⇒ Peso Argentino
                    4- Peso Argentino ⇒ Dolar
                    5- Dolar ⇒ Peso Colombiano
                    6- Peso Colombiano ⇒ Dolar
                    7- Sair
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$%n
                """;

        while (true) {
            System.out.println(opcoesMenu);
            escolha = scanner.nextInt();
            if (escolha <= 0 || escolha > 7) {
                System.out.println("Opção inválida! Tente novamente.");

                continue;
            } if (escolha == 1) {
                System.out.println();
            } if (escolha == 2) {
                continue;
            } if (escolha == 3) {
                continue;
            } if (escolha == 4) {
                continue;
            } if (escolha == 5) {
                continue;
            } if (escolha == 6) {
                continue;
            } if (escolha == 7) {
                System.out.println("Obrigado por usar o Conversor Online! :D");
                break;
            }

        }
        scanner.close();
    }
}
