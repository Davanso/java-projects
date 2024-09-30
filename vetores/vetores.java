package vetores;

public class vetores {
    public static void main(String[] args) {
        // Vetores
        int n [] = new int [5]; // Declaracao
        n[0] = 1; // Valores
        n[1]= 2;
        n[2]= 3;
        n[3]= 4;

        // Se vc ja sabe os valores, declara assim:
        int n2[] = {1,2,3,4};
        
        for (int c=0; c<=5; c++) {
            System.out.println("Na posicao: " + c + ", temos o valor: " + n2[c] + " ");
        }
    }
}
