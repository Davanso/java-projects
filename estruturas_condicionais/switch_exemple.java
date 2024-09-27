package estruturas_condicionais;

public class switch_exemple {
    public static void main(String[] args) {
       /*switch (expressão) {
    case valor1:
        // Bloco de código executado se a expressão for igual a valor1
        break;
    case valor2:
        // Bloco de código executado se a expressão for igual a valor2
        break;
    default:
        // Bloco de código executado se nenhum dos casos anteriores for satisfeito
}
 */ 
    int diaSemana = 3;

    switch (diaSemana) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta-feira");
            break;
        case 5:
            System.out.println("Quinta-feira");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Dia inválido");
            break;
    }
  }
}
