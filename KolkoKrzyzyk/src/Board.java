import java.util.Arrays;
import java.util.Scanner;

public class Board {

    public Value board[][] = new Value[3][3];

    public Board() {

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                board[i][j] = Value.PUSTE;
            }
        }

    }



    public Value getValueFromBoard(int i, int j) {
        return board[i][j];
    }

    private void setValueOnBoard(int i, int j, Player player){
        this.board[i][j] = player.getPlayerId();
    }

    public void getMove(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr wiersza [wartosc od 0 do 2]: ");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj nr kolumny [wartosc od 0 do 2: ");
        int j = Integer.parseInt(scanner.nextLine());

        if(checkMove(i,j) && checkBoard()){
            setValueOnBoard(i,j, player);
        }
    }

    private boolean checkMove(int i, int j){
        if(i < 3 && j < 3 && i >= 0 && j >=0){
            if (board[i][j].getValueOfField() == 0 )
            return true;
        }
        return false;
    }

    public boolean checkBoard(){
       //boolean p = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getValueOfField() == 0){
                    return true;
                }
            }
        }
        return false;
    }

//    public boolean checkWinner (){
//        for (int i = 0; i <3 ; i++) {
//            if(board[i][0].getValueOfField() == board[i][1].getValueOfField() && board[i][0].getValueOfField() == board[i][2].getValueOfField()){
//                return true;
//            }
//        }
//        for (int i = 0; i < 3 ; i++) {
//            if(board[0][i].getValueOfField() == board[1][i].getValueOfField() && board[0][i].getValueOfField() == board[2][i].getValueOfField()){
//                return true;
//            }
//        }
//        if (board[0][0].getValueOfField() == board[1][1].getValueOfField() && board[0][0].getValueOfField() == board[2][2].getValueOfField()){
//            return true;
//        }
//        if (board[0][2].getValueOfField() == board[1][1].getValueOfField() && board[0][2].getValueOfField() == board[2][0].getValueOfField()){
//            return true;
//        }
//        return false;
//    }

    public boolean checkWinner (){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = board[0][i].getValueOfField() + board[1][i].getValueOfField() + board[2][i].getValueOfField();
            if( sum == 3 || sum == -3 ){
                return true;
            }
        }
        sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    sum += board[i][j].getValueOfField();
                }

            }
        }
        if (sum == 3|| sum == -3){
            return true;
        }

        return false;
    }

}
