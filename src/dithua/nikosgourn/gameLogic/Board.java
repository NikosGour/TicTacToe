package dithua.nikosgourn.gameLogic;

import dithua.nikosgourn.GUI.Button;
import dithua.nikosgourn.Nodes.BlankNode;
import dithua.nikosgourn.Nodes.Node;
import dithua.nikosgourn.Nodes.ONode;
import dithua.nikosgourn.Nodes.XNode;

import javax.swing.*;

public class Board {


    //All the tiles of the board
    private Node[] board = new Node[9];

    //Tie check
    private boolean tie;

    //Player switch
    private static int playerTurn = 0;



    public Board()
    {

        //Board settup
        //reset tie and fill the board with blank nodes
        for (int i = 0; i < 9; i++) {
            board[i] = new BlankNode();
        }
        this.tie = false;
    }


    /**
     * Activates on-click and figures out which image to show on the panel clicked
     * @param button The button use to bind the the index of the button to the board
     * @return the coresponding image to display
     */
    public ImageIcon playerPlay(Button button)
    {

        //If playerturn is 0 (Xturn) set c to Xnode else ONode
        Node c  = playerTurn == 0 ? new XNode() : new ONode();

        //Set the board to X or O node and disable button
        board[button.i] = c;
        button.setEnabled(false);

        //Switch turn
        playerTurn = 1 - playerTurn;

        //Set the correct image to return_value
        ImageIcon rv = c instanceof XNode ? new ImageIcon("src/dithua/nikosgourn/assets/X.png")
                        : new ImageIcon("src/dithua/nikosgourn/assets/O.png");
        return rv;
    }

    /**
     * Checks if the game is over
     * @return True if game is over else false
     */
    public boolean isGameOver()
    {
        //Check all possible win combinations
        //Works if all the nodes of a win combo are the same and are not blank
        if (( board[0].getClass().equals( board[1].getClass()) && board[1].getClass().equals( board[2].getClass())) && !(board[0] instanceof BlankNode) ) return true;
        if (( board[3].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[5].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[6].getClass().equals( board[7].getClass()) && board[7].getClass().equals( board[8].getClass())) && !(board[8] instanceof BlankNode) ) return true;
        if (( board[0].getClass().equals( board[3].getClass()) && board[3].getClass().equals( board[6].getClass())) && !(board[0] instanceof BlankNode) ) return true;
        if (( board[1].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[7].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[2].getClass().equals( board[5].getClass()) && board[5].getClass().equals( board[8].getClass())) && !(board[8] instanceof BlankNode) ) return true;
        if (( board[0].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[8].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[2].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[6].getClass())) && !(board[4] instanceof BlankNode) ) return true;

        //If the program reaches this point the game might be a tie
        //No win condition is met , so check if every node is filled
        //if false the game continues
        this.tie = true;
        for (Node node : board) {
            if (node instanceof BlankNode) tie = false;
        }
        if (tie) return true;

        //if the method reaches this point the game is not over
        return false;
    }


}
