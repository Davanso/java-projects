package tipos_primitivos_e_dados.exercicios;

import java.util.Scanner;

public class pesoconver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;  // Variável para armazenar a escolha do usuário

        // Loop que só sai quando a opção for válida
        while (opcao != 1 && opcao != 2) {
            // Perguntar ao usuário qual conversão ele deseja
            System.out.println("Escolha a conversão desejada:");
            System.out.println("1: KG para LB");
            System.out.println("2: LB para KG");
            System.out.print("Digite a opção (1 ou 2): ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                // Conversão de KG para LB
                System.out.print("Digite o peso em KG: ");
                float kg = scanner.nextFloat();
                float libra = kg * 2.2046f;
                System.out.printf("Peso em Libras: %.2f lb\n", libra);
            } else if (opcao == 2) {
                // Conversão de LB para KG
                System.out.print("Digite o peso em Libras: ");
                float libra = scanner.nextFloat();
                float kg = libra / 2.2046f;
                System.out.printf("Peso em Quilos: %.2f kg\n", kg);
            } else {
                // Mensagem de erro e o programa volta ao início
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
