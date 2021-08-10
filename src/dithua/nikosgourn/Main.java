package dithua.nikosgourn;

import dithua.nikosgourn.GUI.Button;
import dithua.nikosgourn.GUI.NPanel;
import dithua.nikosgourn.GUI.Window;
import dithua.nikosgourn.gameLogic.Board;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Create board and window
        var board = new Board();
        Window window = new Window();


        //Array of all the panels used to store the buttons for the game
        NPanel[] panels = new NPanel[9];

        //Create all the panels
        panels[0] = new NPanel(window, 0, 0, 3, 3, 100, 100);
        panels[1] = new NPanel(window, 0, 3, 3, 3, 200, 100);
        panels[2] = new NPanel(window, 0, 3, 3, 0, 300, 100);
        panels[3] = new NPanel(window, 3, 0, 3, 3, 100, 200);
        panels[4] = new NPanel(window, 3, 3, 3, 3, 200, 200);
        panels[5] = new NPanel(window, 3, 3, 3, 0, 300, 200);
        panels[6] = new NPanel(window, 3, 0, 0, 3, 100, 300);
        panels[7] = new NPanel(window, 3, 3, 0, 3, 200, 300);
        panels[8] = new NPanel(window, 3, 3, 0, 0, 300, 300);

        //Create every button and bind it to the correct panel
        for (int i = 0; i < 9 ; i++) {

            panels[i].setLayout(new BorderLayout());
            Button button = new Button(board , i);
            panels[i].add(button);
        }

        //Show window !IMPORTANT! ALWAYS LAST PART OF CODE
        window.setVisible(true);
    }


}
