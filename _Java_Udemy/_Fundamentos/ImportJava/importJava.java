package _Java_Udemy._Fundamentos.ImportJava;

import java.util.Date;
import javax.swing.JButton;

public class importJava {
    public static void main(String[] args) {

        Date data = new Date(); // new: define um objeto, no caso o objeto vai ser "data"
        System.out.println("A hora do sistema é ");
        System.out.println(data.toString());

        JButton button = new JButton();
        button.setText("Botão");
    }
}
