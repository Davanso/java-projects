package estruturas_condicionais.exercicio;

import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        int a = teclado.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = teclado.nextInt();
        
        // Calcular o delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);

        // Verificar se delta é positivo
        if (delta >= 0) {
            // Calcular as raízes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Exibir as raízes
            System.out.printf("x1: %.3f \n", x1);
            System.out.printf("x2: %.3f", x2);
        } else {
            System.out.println("Delta negativo, não há raízes reais.");
        }
        teclado.close();
    }
}
