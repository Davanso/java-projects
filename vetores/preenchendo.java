package vetores;

import java.util.Arrays;

public class preenchendo {
    public static void main(String[] args) {
        int v[] = new int[200];
        Arrays.fill(v, 0); //Preenchendo os valores vazios do vetor v com 0
        for(int valor: v) {
            System.out.print(valor + " ");
        }
    }
}
