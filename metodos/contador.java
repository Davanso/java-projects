package metodos;

public class contador {
    public static String contadores (int i, int f) {
        String s = "";
        for(int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
    // Vou usar essa funcao no arquivo "funcao".
}
