public class PrintBoard {

    //Board board;
    public static void printCurrentBoard(Board board){

        for (int i = 0; i <3 ; i++) {
            System.out.println("-----------");
            for (int j = 0; j <3 ; j++) {
                System.out.print(board.getValueFromBoard(i,j) + " | ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void publicCurrentBoardValue(Board board){

        for (int i = 0; i <3 ; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(board.getValueFromBoard(i,j).getValueOfField() + ", ");
            }
        }

    }



}
