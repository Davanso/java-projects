package estruturas_repeticao;

public class exemple {
    public static void main(String[] args) {
        // Exemplo de while
        int contador = 0;
        while (contador < 3) {
            System.out.println("While: " + contador);
            contador++;
        }

        // Exemplo de do-while
        int contadorDo = 0;
        do {
            System.out.println("Do-While: " + contadorDo);
            contadorDo++;
        } while (contadorDo < 3);

        // Exemplo de for
        for (int i = 0; i < 3; i++) {
            System.out.println("For: " + i);
        }

        // Exemplo de for-each
        int[] numeros = {1, 2, 3};
        for (int numero : numeros) {
            System.out.println("For-Each: " + numero);
        }
    }
}
