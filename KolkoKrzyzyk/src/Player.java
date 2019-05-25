public enum Player {
    PLAYER1(Value.O),
    PLAYER2 (Value.X);

    public final Value playerId;

    Player(Value playerId) {
        this.playerId = playerId;
    }

    public Value getPlayerId() {
        return playerId;
    }
}
