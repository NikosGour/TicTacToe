package dithua.nikosgourn.GUI;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class NPanel extends JPanel{

     public NPanel(JFrame window, int top, int left, int bottom, int right, int xOffset, int yOffset) {
         this.setBorder(new MatteBorder(top, left, bottom, right, Color.BLACK));
         this.setBounds(xOffset, yOffset, 100, 100);
         window.add(this);
     }
}
