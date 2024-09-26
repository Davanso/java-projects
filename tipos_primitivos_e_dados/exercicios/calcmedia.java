package tipos_primitivos_e_dados.exercicios;

import java.util.Scanner;

public class calcmedia {
     public static void main(String[] args) {
        // Criar um Scanner para ler entrada do teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota da primeira prova:");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a nota da segunda prova:");
        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media > 6) {
            System.out.println("A média do aluno ficou abaixo de 6");
        } else {
            System.out.printf("Aluno: %s, Média: %.2f\n", nome, media);
        }
        // Fechar o Scanner para evitar vazamento de recursos
        teclado.close();
    }
}
