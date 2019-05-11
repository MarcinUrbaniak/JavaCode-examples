import java.util.Scanner;

public class Play {


    public static void main(String[] args) {

        Board board = new Board();


        Player player1 = Player.PLAYER1;
        Player player2 = Player.PLAYER2;

        while (board.checkBoard()) {
            PrintBoard.printCurrentBoard(board);
            board.getMove(player1);
            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
            if (!board.checkBoard()) {
                break;
            }
            PrintBoard.printCurrentBoard(board);
            board.getMove(player2);
            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
        }

    }


}
