package interface_win;

import javax.swing.*;

public class SimpleWindows extends JFrame {
    SimpleWindows(){
        super("Пробное онко");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        JButton button1 = new JButton("but");

        getContentPane().add(button1);
    }
}
