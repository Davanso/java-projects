package vetores;

import java.util.Arrays;

public class busca {
    public static void main(String[] args) {
        int num [] = {3,5,7,6,9,4};

        for(int vetor: num) {
            System.out.print(vetor + " ");
        }
        System.out.println();
        int pos = Arrays.binarySearch(num,9); // Busca binaria
        System.out.println("Encontrei o valor na posicao: " + pos);
    }
}
