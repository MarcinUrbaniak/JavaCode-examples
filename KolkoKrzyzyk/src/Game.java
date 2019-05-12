public class Game {



    //Typ użytkownika, który gra
    PlayerType playerType1;
    PlayerType playerType2;

    //Tablica gry
    Board board = new Board();

    Player player1 = Player.PLAYER1;
    Player player2 = Player.PLAYER2;


    public Game(PlayerType playerType1, PlayerType playerType2) {
        //this.playerType1 = playerType1;
        //this.playerType2 = playerType2;

        if(playerType1.getValueOfPlayerType() == 0 && playerType2.getValueOfPlayerType() == 0){

        while (board.checkBoard()) {
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 1 ");
            board.getMoveHuman(player1);
            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
            if (board.checkWinner()){
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
            if (!board.checkBoard()) {
                break;
            }
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 2 ");
            board.getMoveHuman(player2);
            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
            if(board.checkWinner()){
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
        }
        }


        if(playerType1.getValueOfPlayerType() == 1 && playerType2.getValueOfPlayerType() == 1){

            while (board.checkBoard()) {
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 1 ");
            board.getMoveComputerRandom(player1);
            System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
            if (board.checkWinner()){
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
            if (!board.checkBoard()) {
                break;
            }
            PrintBoard.printCurrentBoard(board);
            System.out.println("Player 2 ");
            board.getMoveComputerRandom(player2);
            System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
            if(board.checkWinner()){
                System.out.println("Koniec gry");
                PrintBoard.printCurrentBoard(board);
                break;
            }
        }

        }


        if(playerType1.getValueOfPlayerType() == 0 && playerType2.getValueOfPlayerType() == 1){

            while (board.checkBoard()) {
                PrintBoard.printCurrentBoard(board);
                System.out.println("Player 1 ");
                board.getMoveHuman(player1);
                System.out.println("czy jest zwyciezca player1? " + board.checkWinner());
                if (board.checkWinner()){
                    System.out.println("Koniec gry");
                    PrintBoard.printCurrentBoard(board);
                    break;
                }
                if (!board.checkBoard()) {
                    break;
                }
                PrintBoard.printCurrentBoard(board);
                System.out.println("Player 2 ");
                board.getMoveComputerRandom(player2);
                System.out.println("czy jest zwyciezca player2? " + board.checkWinner());
                if(board.checkWinner()){
                    System.out.println("Koniec gry");
                    PrintBoard.printCurrentBoard(board);
                    break;
                }
            }





        }
    }




}
