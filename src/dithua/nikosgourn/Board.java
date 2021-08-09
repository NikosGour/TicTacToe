package dithua.nikosgourn;

public class Board {

    private Node[][] board = new Node[3][3];
    private boolean tie;
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
        this.tie = false;
        this.gameLoop();
    }
    public void printBoard()
    {
        System.out.printf(" %c | %c | %c " + "\n" +
                          "-----------"    + "\n" +
                          " %c | %c | %c " + "\n" +
                          "-----------"    + "\n" +
                          " %c | %c | %c " + "\n" ,
                        board[0][0].value(),board[0][1].value(),board[0][2].value(),
                        board[1][0].value(),board[1][1].value(),board[1][2].value(),
                        board[2][0].value(),board[2][1].value(),board[2][2].value());
    }

    private void playerPlay(Node player)
    {

        System.out.printf("Player %c's turn%n" , player.value());
        do {
            System.out.print("Give row : ");
            int i = Utils.scan.nextInt();
            Utils.scan.nextLine();

            System.out.print("Give Collumn : ");
            int j = Utils.scan.nextInt();
            Utils.scan.nextLine();
            if (board[i][j] instanceof BlankNode) {
                board[i][j] = player;
                break;
            }

            System.out.println("Invalid Spot");
        }while (true);
    }

    private boolean isGameOver()
    {
        if (( board[0][0].getClass().equals( board[0][1].getClass()) && board[0][1].getClass().equals( board[0][2].getClass())) && !(board[0][0] instanceof BlankNode) ) return true;
        if (( board[1][0].getClass().equals( board[1][1].getClass()) && board[1][1].getClass().equals( board[1][2].getClass())) && !(board[1][1] instanceof BlankNode) ) return true;
        if (( board[2][0].getClass().equals( board[2][1].getClass()) && board[2][1].getClass().equals( board[2][2].getClass())) && !(board[2][2] instanceof BlankNode) ) return true;
        if (( board[0][0].getClass().equals( board[1][0].getClass()) && board[1][0].getClass().equals( board[2][0].getClass())) && !(board[0][0] instanceof BlankNode) ) return true;
        if (( board[0][1].getClass().equals( board[1][1].getClass()) && board[1][1].getClass().equals( board[2][1].getClass())) && !(board[1][1] instanceof BlankNode) ) return true;
        if (( board[0][2].getClass().equals( board[1][2].getClass()) && board[1][2].getClass().equals( board[2][2].getClass())) && !(board[2][2] instanceof BlankNode) ) return true;
        if (( board[0][0].getClass().equals( board[1][1].getClass()) && board[1][1].getClass().equals( board[2][2].getClass())) && !(board[0][0] instanceof BlankNode) ) return true;
        if (( board[0][2].getClass().equals( board[1][1].getClass()) && board[1][1].getClass().equals( board[2][0].getClass())) && !(board[0][2] instanceof BlankNode) ) return true;

        this.tie = true;
        for (Node[] nodes : board) {
            for (Node node: nodes) {
                if (node instanceof BlankNode) tie = false;
            }
        }
        if (tie) return true;
        return false;
    }

    public void gameLoop()
    {
        this.printBoard();
        int player = 0;
        Node[] allPlayers = {new XNode(),new ONode()};

        while (true)
        {
            playerPlay(allPlayers[player]);
            if (isGameOver()) break;
            player = 1 - player;
            printBoard();
        }
        if (tie)
        {
            System.out.printf("Tie!");
        }
        else System.out.println("Player Won");
    }
}
