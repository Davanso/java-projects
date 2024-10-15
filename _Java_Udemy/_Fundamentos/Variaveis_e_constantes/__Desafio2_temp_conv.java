package _Java_Udemy._Fundamentos.Variaveis_e_constantes;

import java.util.Scanner;

public class __Desafio2_temp_conv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;  // Variável para armazenar a escolha do usuário

        // Loop que só sai quando a opção for válida
        while (opcao != 1 && opcao != 2) {
            // Perguntar ao usuário qual conversão ele deseja
            System.out.println("Escolha a conversão desejada:");
            System.out.println("1: Celsius para Fahrenheit");
            System.out.println("2: Fahrenheit para Celsius");
            System.out.print("Digite a opção (1 ou 2): ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                // Conversão de Celsius para Fahrenheit
                System.out.print("Digite a temperatura em Celsius: ");
                float celsius = scanner.nextFloat();
                float fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
            } else if (opcao == 2) {
                // Conversão de Fahrenheit para Celsius
                System.out.print("Digite a temperatura em Fahrenheit: ");
                float fahrenheit = scanner.nextFloat();
                float celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
            } else {
                // Mensagem de erro e o programa volta ao início
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
