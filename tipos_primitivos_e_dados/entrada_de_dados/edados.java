package tipos_primitivos_e_dados.entrada_de_dados;

import java.util.Scanner; // Para escanear entrada.

public class edados {
    public static void main(String[] args) {
        // Criar um Scanner para ler entrada do teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.printf("Nome: %s , Nota: %.1f \n", nome, nota);
        
        // Fechar o Scanner para evitar vazamento de recursos
        teclado.close();
    }
}

/*
 * Para ler entrada do teclado: Scanner teclado = new Scanner(System.in); *Necessario
 
 * Para ler valores de tipo int: int idade = teclado.nextInt();
 * Para ler valores de tipo real: float salario = teclado.nextFloat();
 * Para ler valores de tipo string: String nome = teclado.nextLine();
 */