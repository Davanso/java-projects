package estruturas_condicionais.exercicio;

import java.util.Scanner;

public class quantaspernas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4: 
                tipo = "Quadrupede";
                break;
            case 6: 
                tipo = "Aranha";   
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
        teclado.close();
    }
}
