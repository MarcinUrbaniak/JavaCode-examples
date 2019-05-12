public class Play {


    public static void main(String[] args) {


        PlayerType playerType1 = PlayerType.HUMAN;
        PlayerType playerType2 = PlayerType.COMPUTER;

        Game game = new Game(playerType1, playerType2);


//        Board board = new Board();
//
//
//        Player player1 = Player.PLAYER1;
//        Player player2 = Player.PLAYER2;
//
//        while (board.checkBoard()) {
//            PrintBoard.printCurrentBoard(board);
//            System.out.println("Player 1 ");
//            board.getMoveHuman(player1);
//            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
//            if (board.checkWinner()){
//                System.out.println("Koniec gry");
//                PrintBoard.printCurrentBoard(board);
//                break;
//            }
//            if (!board.checkBoard()) {
//                break;
//            }
//            PrintBoard.printCurrentBoard(board);
//            System.out.println("Player 2 ");
//            board.getMoveHuman(player2);
//            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
//            if(board.checkWinner()){
//                System.out.println("Koniec gry");
//                PrintBoard.printCurrentBoard(board);
//                break;
//            }
//        }

/**
 * Kod testujący. Random komputer gra z random komputerem
 *
 *
 */
//        while (board.checkBoard()) {
//            PrintBoard.printCurrentBoard(board);
//            System.out.println("Player 1 ");
//            board.getMoveComputerRandom(player1);
//            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
//            if (board.checkWinner()){
//                System.out.println("Koniec gry");
//                PrintBoard.printCurrentBoard(board);
//                break;
//            }
//            if (!board.checkBoard()) {
//                break;
//            }
//            PrintBoard.printCurrentBoard(board);
//            System.out.println("Player 2 ");
//            board.getMoveComputerRandom(player2);
//            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
//            if(board.checkWinner()){
//                System.out.println("Koniec gry");
//                PrintBoard.printCurrentBoard(board);
//                break;
//            }
//        }

    }


}
