public class arraysPT3 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        // Iterar
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";

        for (int i = 0; i < nomes.length; i++) { //.length imprime o tamanho do array
            System.out.println(nomes[i]);
        }
    }
}
