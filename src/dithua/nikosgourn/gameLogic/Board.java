package dithua.nikosgourn.gameLogic;

import dithua.nikosgourn.GUI.Button;
import dithua.nikosgourn.Nodes.BlankNode;
import dithua.nikosgourn.Nodes.Node;
import dithua.nikosgourn.Nodes.ONode;
import dithua.nikosgourn.Nodes.XNode;

import javax.swing.*;

public class Board {

    private Node[] board = new Node[9];
    private boolean tie;
    private static int playerTurn = 0;

    public Board()
    {
        for (int i = 0; i < 9; i++) {
            board[i] = new BlankNode();
        }
        this.tie = false;
    }

    public ImageIcon playerPlay(Button button)
    {
        Node c = new ONode();
        if (playerTurn == 0){c = new XNode();}

        board[button.i] = c;
        button.setEnabled(false);
        playerTurn = 1 - playerTurn;

        ImageIcon rv = new ImageIcon("src/dithua/nikosgourn/assets/O.png");
        if (c instanceof XNode){
            rv = new ImageIcon("src/dithua/nikosgourn/assets/X.png");
        }

        return rv;
    }

    public boolean isGameOver()
    {
        if (( board[0].getClass().equals( board[1].getClass()) && board[1].getClass().equals( board[2].getClass())) && !(board[0] instanceof BlankNode) ) return true;
        if (( board[3].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[5].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[6].getClass().equals( board[7].getClass()) && board[7].getClass().equals( board[8].getClass())) && !(board[8] instanceof BlankNode) ) return true;
        if (( board[0].getClass().equals( board[3].getClass()) && board[3].getClass().equals( board[6].getClass())) && !(board[0] instanceof BlankNode) ) return true;
        if (( board[1].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[7].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[2].getClass().equals( board[5].getClass()) && board[5].getClass().equals( board[8].getClass())) && !(board[8] instanceof BlankNode) ) return true;
        if (( board[0].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[8].getClass())) && !(board[4] instanceof BlankNode) ) return true;
        if (( board[2].getClass().equals( board[4].getClass()) && board[4].getClass().equals( board[6].getClass())) && !(board[4] instanceof BlankNode) ) return true;

        this.tie = true;
        for (Node node : board) {
            if (node instanceof BlankNode) tie = false;
        }
        if (tie) return true;
        return false;
    }


}
