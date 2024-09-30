package estruturas_repeticao;

public class repeticao {
    public static void main(String[] args) {
        
   
    // While: 
    int contador = 0;
    while (contador < 5) {
        System.out.println("Contador: " + contador);
        contador++;
    }

    // Do-While:
    int contador2 = 0;
    do {
        System.out.println("Contador: " + contador);
        contador++;
    } while (contador2 < 5);


    // For
    /*
     * for (inicialização; condição; incremento/decremento) {
    // Bloco de código executado enquanto a condição for verdadeira
    }
     */

    for (int i = 0; i < 5; i++) {
        System.out.println("Contador: " + i);
    }

    // For-Each
    int[] numeros = {1, 2, 3, 4, 5};
    for (int numero : numeros) {
        System.out.println("Numero: " + numero);
    } // Esse código percorre o array numeros e imprime cada elemento.

    // Break
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            break;  // Sai do laço quando i for igual a 5
        }
        System.out.println(i);
    }

    // Continue
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            continue;  // Pula a iteração quando i for igual a 5
        }
        System.out.println(i);
    }
  }    
}
