package estruturas_condicionais;

public class else_if_exemple {
    public static void main(String[] args) {
        
    int idade = 16;

    if (idade >= 18) {
        System.out.println("Você é maior de idade.");
    } else {
        System.out.println("Você é menor de idade.");
    }

    // else if:
    int nota = 85;

    if (nota >= 90) {
        System.out.println("Aprovado com distinção.");
    } else if (nota >= 70) {
        System.out.println("Aprovado.");
    } else {
        System.out.println("Reprovado.");
    }
  }
}
