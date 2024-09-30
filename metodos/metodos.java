package metodos;

public class metodos {
    static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("Soma: " + resultado);
    }

    static void subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println("Subtração: " + resultado);
    }

    static void multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("Multiplicação: " + resultado);
    }

    public static void main(String[] args) {
        soma(5, 10);
        subtracao(5, 10);
        multiplicacao(5, 10);
    }
}
