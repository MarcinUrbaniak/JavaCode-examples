public class Game {


    //Typ użytkownika, który gra
    PlayerType playerType1;
    PlayerType playerType2;

    //Tablica gry
    Board board = new Board();

    Player player1 = Player.PLAYER1;
    Player player2 = Player.PLAYER2;


    public Game(PlayerType playerType1, PlayerType playerType2) {
        gameMethod(playerType1, playerType2);
    }


    private void gameMethod(PlayerType playerType1, PlayerType playerType2) {
        int round = 1;
        while (board.checkBoard()) {

            System.out.println("runda " + round);
            round ++;
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 1 ");
            if (playerType1 == PlayerType.HUMAN) {
                board.getMoveHuman(player1);
            } else {
                //board.setMoveComputerRandom(player1);
                board.setMoveComputer(player1);
            }
            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
            if (board.checkWinner()) {
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
            if (!board.checkBoard()) {
                break;
            }
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 2 ");
            if (playerType2 == PlayerType.HUMAN) {
                board.getMoveHuman(player2);
            } else {
                //board.setMoveComputerRandom(player2);
                board.setMoveComputer(player2);
            }
            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
            if (board.checkWinner()) {
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
        }
    }


}
