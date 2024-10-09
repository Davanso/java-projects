public class arraysPT4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10}; // Inicializando diretamente com os valores
        int[] numeros2 = {10,9,8,7,6,5,4,3,2,1};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        // Usando o Foreach
        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
