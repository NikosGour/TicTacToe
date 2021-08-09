package dithua.nikosgourn;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//        var board = new Board();

        JFrame window = new JFrame();
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setLayout(null);

        JPanel topleft  = new JPanel();
        topleft.setBorder(new MatteBorder(0,0,3,3, Color.BLACK));
        topleft.setBounds(100,100,100,100 );
        window.add(topleft);

        JPanel topmid  = new JPanel();
        topmid.setBorder(new MatteBorder(0,3,3,3, Color.BLACK));
        topmid.setBounds(200,100,100,100 );
        window.add(topmid);

        JPanel topright  = new JPanel();
        topright.setBorder(new MatteBorder(0,3,3,0, Color.BLACK));
        topright.setBounds(300,100,100,100 );
        window.add(topright);

        JPanel midleft  = new JPanel();
        midleft.setBorder(new MatteBorder(3,0,3,3, Color.BLACK));
        midleft.setBounds(100,200,100,100 );
        window.add(midleft);

        JPanel midmid  = new JPanel();
        midmid.setBorder(new MatteBorder(3,3,3,3, Color.BLACK));
        midmid.setBounds(200,200,100,100 );
        window.add(midmid);

        JPanel midright  = new JPanel();
        midright.setBorder(new MatteBorder(3,3,3,0, Color.BLACK));
        midright.setBounds(300,200,100,100 );
        window.add(midright);

        JPanel botleft  = new JPanel();
        botleft.setBorder(new MatteBorder(3,0,0,3, Color.BLACK));
        botleft.setBounds(100,300,100,100 );
        window.add(botleft);

        JPanel botmid  = new JPanel();
        botmid.setBorder(new MatteBorder(3,3,0,3, Color.BLACK));
        botmid.setBounds(200,300,100,100 );
        window.add(botmid);

        JPanel botright  = new JPanel();
        botright.setBorder(new MatteBorder(3,3,0,0, Color.BLACK));
        botright.setBounds(300,300,100,100 );
        window.add(botright);
    }
}
