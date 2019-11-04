package interface_win;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_window extends JFrame{
    BorderLayout_window(){
        super("window_on_table");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);

        JButton but1 = new JButton("but");
        JButton but2 = new JButton("but2");
        JButton but3 = new JButton("but3");
        JButton but4 = new JButton("but4");
        JButton but5 = new JButton("but");
        getContentPane().add(but1, BorderLayout.WEST);
        getContentPane().add(but2, BorderLayout.EAST);
        getContentPane().add(but3, BorderLayout.NORTH);
        getContentPane().add(but4, BorderLayout.SOUTH);
        getContentPane().add(but5);
    }
}
