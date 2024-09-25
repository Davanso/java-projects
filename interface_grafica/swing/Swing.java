package interface_grafica.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Swing {

    public static void main(String[] args) {
        // Cria a janela principal (JFrame)
        JFrame frame = new JFrame("Relógio Atual do Sistema");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // Cria um JLabel para exibir a hora
        JLabel labelHora = new JLabel();
        labelHora.setHorizontalAlignment(SwingConstants.CENTER);
        labelHora.setFont(new Font("Arial", Font.BOLD, 40));
        frame.add(labelHora, BorderLayout.CENTER);
        
        // Formatação da hora (hh:mm:ss)
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        // Timer para atualizar a hora a cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém a hora atual e formata
                String horaAtual = LocalTime.now().format(formatoHora);
                // Atualiza o JLabel com a hora atual
                labelHora.setText(horaAtual);
            }
        });
        
        // Inicia o Timer
        timer.start();
        
        // Torna a janela visível
        frame.setVisible(true);
    }
}
