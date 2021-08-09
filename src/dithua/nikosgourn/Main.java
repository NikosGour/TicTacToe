package dithua.nikosgourn;

import javax.swing.*;
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

        JPanel[] panels = new JPanel[9];
        panels[0] = createPanel(window, 0, 0, 3, 3, 100, 100);
        panels[1] = createPanel(window, 0, 3, 3, 3, 200, 100);
        panels[2] = createPanel(window, 0, 3, 3, 0, 300, 100);
        panels[3] = createPanel(window, 3, 0, 3, 3, 100, 200);
        panels[4] = createPanel(window, 3, 3, 3, 3, 200, 200);
        panels[5] = createPanel(window, 3, 3, 3, 0, 300, 200);
        panels[6] = createPanel(window, 3, 0, 0, 3, 100, 300);
        panels[7] = createPanel(window, 3, 3, 0, 3, 200, 300);
        panels[8] = createPanel(window, 3, 3, 0, 0, 300, 300);

        JButton but = new JButton();
        but.setBackground(Color.white);
        panels[0].setLayout(new BorderLayout());
        panels[0].add(but);
    }

    private static JPanel createPanel(JFrame window, int top, int left, int bottom, int right, int xOffset, int yOffset) {
        JPanel panel = new JPanel();
        panel.setBorder(new MatteBorder(top, left, bottom, right, Color.BLACK));
        panel.setBounds(xOffset, yOffset, 100, 100);
        window.add(panel);
        return panel;
    }
}
