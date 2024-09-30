package vetores;

import java.util.Scanner;

public class usovetores {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Solicita ao usuário o ano para verificar se é bissexto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        // Verifica se o ano é bissexto
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            tot[1] = 29; // Ajusta fevereiro para 29 dias
        }

        // Exibe os meses com o número de dias
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }

        scanner.close();
    }
}
