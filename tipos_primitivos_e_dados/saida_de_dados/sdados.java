package tipos_primitivos_e_dados.saida_de_dados;

public class sdados {
    public static void main(String[] args) {
        String nome = "Guilherme";
        float nota = 8.5f;
        System.out.printf("Nome: %s , Nota: %.1f \n", nome, nota); // Formatando com duas casa decimais
        //Podemos utilizar tambem:
        System.out.format("Nome: %s , Nota: %.2f \n", nome, nota);
    }
}
