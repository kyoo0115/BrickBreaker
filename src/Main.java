import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation(dim.width/2-obj.getSize().width/2, dim.height/2-obj.getSize().height/2);

    }
}

