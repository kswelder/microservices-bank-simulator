package kswelder.com.github.com.CheckList.gui;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame{
    public Application() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point right = new Point(screenSize.width - 400, screenSize.height / 20 );
        setSize(300,600);
        setTitle("Check List");
        setLocation(right);
    }
}
