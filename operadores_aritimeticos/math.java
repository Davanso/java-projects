package operadores_aritimeticos;

public class math {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Exponenciação
        int exponenciacao = (int) Math.pow(a, b);
        System.out.println("Exponenciação: " + exponenciacao);

        // PI
        double pi = Math.PI;
        System.out.printf("PI: %.2f\n", pi);

        // sqrt (raiz quadrada)
        double sqrt = Math.sqrt(a);
        System.out.printf("Sqrt: %.2f\n", sqrt);

        // cbrt (raiz cúbica)
        double cbrt = Math.cbrt(a);
        System.out.printf("Cbrt: %.2f\n", cbrt);

        // random (número aleatório)
        double random = Math.random();
        System.out.printf("Random: %.2f\n", random);
    }
}
