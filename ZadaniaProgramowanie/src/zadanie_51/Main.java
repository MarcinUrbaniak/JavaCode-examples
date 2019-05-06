package zadanie_51;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        RectangleField rectangleField = new RectangleField();
        RectangleField rectangleField1 = new RectangleField();

        rectangleField.readData();
        rectangleField1.readData();
        rectangleField.calculateField();
        rectangleField1.calculateField();
        rectangleField.showResult();
        rectangleField1.showResult();

    }
}
