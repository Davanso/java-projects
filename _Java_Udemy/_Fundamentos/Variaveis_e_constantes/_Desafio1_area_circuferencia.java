package _Java_Udemy._Fundamentos.Variaveis_e_constantes;

import java.util.Scanner;

public class _Desafio1_area_circuferencia {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        String raio = teclado.nextLine();

        // Constante
        double PI = 3.14;
        
        double area = PI * Math.pow(Double.parseDouble(raio), 2);
        System.out.printf("Area: %.2s m² \n", area);

        teclado.close();
    }
}
