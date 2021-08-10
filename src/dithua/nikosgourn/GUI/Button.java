package dithua.nikosgourn.GUI;

import dithua.nikosgourn.gameLogic.Board;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public static Button[] buttons = new Button[9];
    public int i;
    private Board board;

    public Button(Board board, int i){
        this.board = board;
        buttons[i] = this;
        this.i = i;
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setContentAreaFilled(false);
        this.addActionListener(e ->
        {

//            this.setText(Character.toString(this.board.playerPlay(this)));
            var image  = this.board.playerPlay(this);

            this.setIcon(image);
            this.setDisabledIcon(image);
            if (this.board.isGameOver())
            {
                for (Button button : buttons) {
                    button.setEnabled(false);
                }
            }

        });
    }
}
