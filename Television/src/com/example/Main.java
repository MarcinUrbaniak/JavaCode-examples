package com.example;

public class Main {
    public static void main(String[] args) {

        //Manufacturer manufacturer1 = new Manufacturer();
        Car car1 = new Car();


        //TV tv1 = new TV("Sony", 324433, 46, manufacturer1);
    }
}
/**
 * Najpierw inicjowane są wlaściwości klasy z deklaracji właściwości (w tym przypadku SteeringWheel).
 * W kolejnym kroku wywoływany jest konstruktor (w tym przypadku Car)
 * Konstruktor Car tworzy nowy obiekt Engine. Z kolei Engine najpierw inicjowane są właściwości klasy Engine a następnie
 * konstruktor klasy Engine, w którym tworzony jest nowy obiekt Cooler. To kończy sprawę.
 *
 *
 * Konstruktor 'SteeringWheel' został wywołany
 * Konstruktor 'Car' został wywołany
 * Konstruktor 'SparkPlug' został wywołany
 * Konstruktor 'Engine' został wywołany
 * Konstruktor 'Cooler' został wywołany
 *
 * Po dodaniu statycznej właściwości manufacturer do klasy Car w pierwszej kolejności jest wywoływana właśnie właściwość
 * statyczna
 *
 * Konstruktor Manufacturer został wywołany
 * Konstruktor 'SteeringWheel' został wywołany
 * Konstruktor 'Car' został wywołany
 * Konstruktor 'SparkPlug' został wywołany
 * Konstruktor 'Engine' został wywołany
 * Konstruktor 'Cooler' został wywołany
 */
