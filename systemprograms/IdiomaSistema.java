package systemprograms;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        // Obtém o Locale padrão do sistema
        Locale idioma = Locale.getDefault();

        // Exibe o nome do idioma
        System.out.println("Idioma do sistema: " + idioma.getDisplayLanguage());
    }
}
