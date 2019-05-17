import java.util.Random;
import java.util.Scanner;

public class Board {

    public Value board[][] = new Value[3][3];

    public Board() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Value.P;
            }
        }

    }


    public Value getValueFromBoard(int i, int j) {
        return board[i][j];
    }

    private void setValueOnBoard(int i, int j, Player player) {
        this.board[i][j] = player.getPlayerId();
    }

    public void setMoveHuman(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr wiersza [wartosc od 0 do 2]: ");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj nr kolumny [wartosc od 0 do 2: ");
        int j = Integer.parseInt(scanner.nextLine());

        while (!checkMove(i, j)) {
            System.out.println("Podaj nr wiersza [wartosc od 0 do 2]: ");
            i = Integer.parseInt(scanner.nextLine());
            System.out.println("Podaj nr kolumny [wartosc od 0 do 2: ");
            j = Integer.parseInt(scanner.nextLine());
        }

        if (checkMove(i, j) && checkBoard()) {
            setValueOnBoard(i, j, player);
        }
    }

    public void setMoveComputerRandom(Player player) {

        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);

        //Jeżeli pole jest zajęte, to losuj współrzędne jeszcze raz
        while (!checkMove(i, j)) {
            i = random.nextInt(3);
            j = random.nextInt(3);
        }

        if (checkMove(i, j) && checkBoard()) {
            setValueOnBoard(i, j, player);
        }
    }

    /**
     * czy w którymkolwiek rzędzie/skosie nie ma dwóch swoich znaków i jednego pustego. Jeżeli taką sytuacje napotka
     * to zapełnia puste pole swoim znakiem i w ten sposób wygrywa,
     * następnie algorytm sprawdzi czy w którymkolwiek rzędzie/skosie nie ma dwóch znaków przeciwnika i jednego pustego.
     * Jeżeli taką sytuacje napotka to zapełnia puste pole, blokując tym samym wygraną przeciwnika,
     * ostatnią możliwością jest to, że żaden z powyższych przykładów nie ma miejsca,
     * wtedy niech funkcja losowa wybierze pole to zapełnienia.
     */


    public void setMoveComputer(Player player) {
        //komputer zawsze gra X
        boolean isRandom = true;
        boolean isMove = true;


        Value value = Value.X;

        //szukam wygranej
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == Value.X && board[1][i] == Value.X) || (board[2][i] == Value.X && board[0][i] == Value.X) || (board[1][i] == Value.X && board[2][i] == Value.X)) {
                for (int j = 0; j < 3; j++) {
                    if (board[j][i] == Value.P && isMove) {
                        setValueOnBoard(j, i, player);
                        isRandom = false;
                        isMove = false;
                        System.out.println("szukam wygranej 1");
                        System.out.println("i, j = " + i + ", " + j);
                    }
                }
            }

        }

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == Value.X && board[i][1] == Value.X) || (board[i][2] == Value.X && board[i][0] == Value.X) || (board[i][1] == Value.X && board[i][2] == Value.X)) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == Value.P && isMove) {
                        setValueOnBoard(j, i, player);
                        isRandom = false;
                        isMove = false;
                        System.out.println("szukam wygranej 2");
                        System.out.println("i, j = " + i + ", " + j);
                    }
                }
            }

        }

        if ((board[0][0] == Value.X && board[1][1] == Value.X) || (board[2][2] == Value.X && board[0][0] == Value.X) || (board[1][1] == Value.X && board[2][2] == Value.X)) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == Value.P && isMove) {
                    setValueOnBoard(i, i, player);
                    isRandom = false;
                    isMove = false;
                    System.out.println("szukam wygranej 3");
                    System.out.println("i, j = " + i + ", " + i);
                }
            }
        }

        if ((board[0][2] == Value.X && board[1][1] == Value.X) || (board[2][0] == Value.X && board[0][0] == Value.X) || (board[0][2] == Value.X && board[2][0] == Value.X)) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == Value.P && isMove) {
                    setValueOnBoard(i, i, player);
                    isRandom = false;
                    isMove = false;
                    System.out.println("szukam wygranej 4");
                    System.out.println("i, j = " + i + ", " + i);
                }
            }
        }
        //blokuje przeciwnika
        //blokujemy kolumny
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == Value.O && board[1][i] == Value.O) || (board[2][i] == Value.O && board[0][i] == Value.O) || (board[1][i] == Value.O && board[2][i] == Value.O)) {
                for (int j = 0; j < 3; j++) {
                    if (board[j][i] == Value.P && isMove) {
                        setValueOnBoard(j, i, player);
                        isRandom = false;
                        isMove = false;
                        System.out.println(" Pierwszy blok ");
                        System.out.println("i, j = " + i + ", " + j);
                    }
                }
            }

        }
        //blokujemy wiersze
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == Value.O && board[i][1] == Value.O) || (board[i][2] == Value.O && board[i][0] == Value.O) || (board[i][1] == Value.O && board[i][2] == Value.O)) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == Value.P && isMove) {
                        setValueOnBoard(i, j, player);
                        isRandom = false;
                        isMove = false;
                        System.out.println("Drugi blok");
                        System.out.println("i, j = " + i + ", " + j);
                    }
                }
            }

        }

        if ((board[0][0] == Value.O && board[1][1] == Value.O) || (board[2][2] == Value.O && board[0][0] == Value.O) || (board[1][1] == Value.O && board[2][2] == Value.O)) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == Value.P && isMove) {
                    setValueOnBoard(i, i, player);
                    isRandom = false;
                    isMove = false;
                    System.out.println("Trzeci blok");
                    System.out.println("i, j = " + i + ", " + i);
                }
            }
        }

        if ((board[0][2] == Value.O && board[1][1] == Value.O) || (board[2][0] == Value.O && board[0][0] == Value.O) || (board[0][2] == Value.O && board[2][0] == Value.O)) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == Value.P && isMove) {
                    setValueOnBoard(i, i, player);
                    isRandom = false;
                    isMove = false;
                    System.out.println("Czwarty blok");
                    System.out.println("i, j = " + i + ", " + i);
                }
            }
        }
        //random jak zaden z powyzszych1
        if (isRandom && isMove) {
            setMoveComputerRandom(player);

        }

        System.out.println("isRandom = " + isRandom);

    }


    private boolean checkMove(int i, int j) {
        if (i < 3 && j < 3 && i >= 0 && j >= 0) {
            if (board[i][j].getValueOfField() == 0)
                return true;
        }
        return false;
    }

    public boolean checkBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getValueOfField() == 0) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean checkWinner() {
        int sum = 0;
        //sprawdzanie kolumn
        for (int i = 0; i < 3; i++) {
            sum = board[0][i].getValueOfField() + board[1][i].getValueOfField() + board[2][i].getValueOfField();
            if (sum == 3 || sum == -3) {
                return true;
            }
        }
        sum = 0;
        //sprawdzanie wierszy
        for (int i = 0; i < 3; i++) {
            sum = board[i][0].getValueOfField() + board[i][1].getValueOfField() + board[i][2].getValueOfField();
            if (sum == 3 || sum == -3) {
                return true;
            }
        }
        //sprawdzenie na ukos
        sum = 0;
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[2][2] != Value.P) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[2][0] == board[0][2] && board[0][2] != Value.P) {
            return true;
        }

        return false;

    }

}
