package interface_win;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_window extends JFrame {
    FlowLayout_window(){
        super("windod_on_flow_layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


       JPanel panel = new JPanel();
       panel.setLayout(new FlowLayout());
       panel.add(new JButton("but1"));
        panel.add(new JButton("but3"));
        panel.add(new JButton("but4"));
        setContentPane(panel);
        setSize(400,200);
    }

}
