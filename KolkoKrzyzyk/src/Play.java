import java.util.Scanner;

public class Play {


    public static void main(String[] args) {

        Board board = new Board();


        Player player1 = Player.PLAYER1;
        Player player2 = Player.PLAYER2;

        while (board.checkBoard()) {
            PrintBoard.printCurrentBoard(board);
            board.getMove(player1);
            if (board.checkBoard()) {
                break;
            }
            PrintBoard.printCurrentBoard(board);
            board.getMove(player2);
        }

//    do {
//        PrintBoard.printCurrentBoard(board);
//        board.getMove(player1);
//        PrintBoard.printCurrentBoard(board);
//        board.getMove(player2);
//    } while (board.checkBoard());


//    for ( ; board.checkBoard();){
//        PrintBoard.printCurrentBoard(board);
//        board.getMove(player1);
//        PrintBoard.printCurrentBoard(board);
//        board.getMove(player2);
//    }


    }


}
