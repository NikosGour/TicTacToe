package dithua.nikosgourn;

public class Board {

    private Node[] board = new Node[9];
    private boolean tie;
    private static int playerTurn = 0;
    //TODO: Implement : Check win condition
    //                  Update Board
    //                  Update Scoreboard
    //                  Que players to players
    Board()
    {
        for (int i = 0; i < 9; i++) {
            board[i] = new BlankNode();
        }
        this.tie = false;
    }
    public void printBoard()
    {
        System.out.printf(" %c | %c | %c " + "\n" +
                          "-----------"    + "\n" +
                          " %c | %c | %c " + "\n" +
                          "-----------"    + "\n" +
                          " %c | %c | %c " + "\n" ,
                        board[0].value(),board[1].value(),board[2].value(),
                        board[3].value(),board[4].value(),board[5].value(),
                        board[6].value(),board[7].value(),board[8].value());
    }

    public char playerPlay(Button button)
    {
        Node c = new ONode();
        if (playerTurn == 0){c = new XNode();}

        board[button.i] = c;
        playerTurn = 1 - playerTurn;
        return c.value();
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
