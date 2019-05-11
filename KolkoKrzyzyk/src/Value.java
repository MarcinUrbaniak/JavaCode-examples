public enum Value {

    O(1),
    X(-1),
    PUSTE(0);


    public final int valueOfField;


    Value(int valueOfField) {
        this.valueOfField = valueOfField;
    }

    public int getValueOfField() {
        return valueOfField;
    }
}
