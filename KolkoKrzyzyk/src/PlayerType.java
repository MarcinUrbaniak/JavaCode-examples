public enum PlayerType {

    HUMAN(0),
    COMPUTER(1);

    public final int valueOfPlayerType;

    PlayerType(int valueOfPlayerType) {
        this.valueOfPlayerType = valueOfPlayerType;
    }

    public int getValueOfPlayerType() {
        return valueOfPlayerType;
    }
}
