package systemprograms;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Obtém a resolução tela
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = (int) tamanhoTela.getWidth();
        int altura  = (int) tamanhoTela.getHeight();

        //Exibe a resolução
        System.out.println("Resolução da tela:" + " " + largura + " x " + altura);
        }
    }
