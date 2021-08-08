package dithua.nikosgourn;

public class Board {

    private Node[][] board = new Node[3][3];

    //TODO: Implement : Check win condition
    //                  Update Board
    //                  Update Scoreboard
    //                  Que players to players
    Board()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new BlankNode();
            }
        }
    }
    public void printBoard()
    {
        System.out.printf(" %c | %c | %c \n" +
                          "-----------\n" +
                          " %c | %c | %c \n" +
                          "-----------\n" +
                          " %c | %c | %c \n",
                        board[0][0].value(),board[0][1].value(),board[0][2].value(),
                        board[1][0].value(),board[1][1].value(),board[1][2].value(),
                        board[2][0].value(),board[2][1].value(),board[2][2].value());
    }
}
