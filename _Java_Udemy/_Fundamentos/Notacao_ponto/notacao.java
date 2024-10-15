package _Java_Udemy._Fundamentos.Notacao_ponto;

public class notacao {
    public static void main(String[] args) {
        String s = "Bom dia x";
        s = s.toUpperCase(); // Usando o . temos uma lista de funcionalidades

        // s = s.replace("x", "Senhora") -> Output: Bom dia Senhora
        // s = s.concat("!!!"); -> Output: Bom dia Senhora!!!


        System.out.println(s);
        
        // Posso fazer direto na saida
        System.out.println("Gui".toLowerCase());

        // Ou quebrando linhas 
        String y = "Bom dia X"
        .replace("X", "mano")
        .concat("!!!");

        System.out.println(y);


        // Tipos primitivos nao tem o operador "."!
    }
}
