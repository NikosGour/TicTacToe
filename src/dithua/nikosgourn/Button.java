package dithua.nikosgourn;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public static Button[][] buttons = new Button[3][3];
    public int i;
    public int j;

    Board board;
    Button(Board board , int i , int j){
        this.board = board;
        buttons[i][j] = this;
        this.i = i;
        this.j = j;
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.addActionListener(e ->
        {

        });
    }
}
