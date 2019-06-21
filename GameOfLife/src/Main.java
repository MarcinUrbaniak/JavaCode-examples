import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        int board[][] = generateRandomBoard(3,3);
        printBoard(board);

        try{
            for (int i = 0; i <50 ; i++) {
                generateNextBoard(board);
                printBoard(board);
                Thread.sleep(100);
                clrscr();

            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        dataFromUser();

    }

    private static void dataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra w życie. Podaj podstawowe parametry.");
        System.out.println("Podaj liczbę wierszy planszy");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę kolumn planszy");
        int column = Integer.parseInt(scanner.nextLine());
    }

    private static void generateNextBoard(int[][] board) {
        for (int i = 1; i < board.length -1 ; i++) {

            for (int j = 1; j < board[i].length -1 ; j++) {
                int livingNeighbours = 0;

                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {

                        if (i+k<0 || i+k>board.length -1){
                            continue;
                        }
                        if (j+l<0 || j+l>board.length -1){
                            continue;
                        }
                        livingNeighbours += board[i+k][j + l];
                    }
                }
                livingNeighbours -= board[i][j];

                if (livingNeighbours == 3 && board[i][j] == 0){
                    board[i][j] = 1;
                } else if((livingNeighbours == 2 || livingNeighbours ==3) && board[i][j] == 1){
                    board[i][j] = 1;
                } else if((livingNeighbours < 2 || livingNeighbours > 3) && board[i][j] == 1){
                    board[i][j] = 0;
                }
            }
        }
    }

    private static void printBoard(int[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            //System.out.print("[");
            for (int j = 0; j <board[i].length ; j++) {

                if(board[i][j] == 0){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    //generowanie planszy z wartosciami losowymi dla zadanej planszy
    private static int[][] generateRandomBoard(int row, int column){
        int[][] board = new int[row][column];
        Random random = new Random();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                board[i][j] = random.nextInt(2);
            }
        } return board;
    }

    public static void clrscr() throws IOException {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
