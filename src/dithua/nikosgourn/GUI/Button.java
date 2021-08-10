package dithua.nikosgourn.GUI;

import dithua.nikosgourn.gameLogic.Board;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    //All the buttons
    public static Button[] buttons = new Button[9];

    //Index of the button in the buttons array
    public int i;

    //The game-board used in the button actions
    private Board board;

    public Button(Board board, int i){
        //Variable Settup
        this.board = board;
        buttons[i] = this;
        this.i = i;

        //Button Settup
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setContentAreaFilled(false);

        //Button Action
        this.addActionListener(e ->
        {

            //On click return the image (x or o) to display
            var image  = this.board.playerPlay(this);


            //Display the image
            this.setIcon(image);
            this.setDisabledIcon(image);

            //If game over Disable all buttons
            if (this.board.isGameOver())
            {
                for (Button button : buttons) {
                    button.setEnabled(false);
                }
            }

        });
    }
}
