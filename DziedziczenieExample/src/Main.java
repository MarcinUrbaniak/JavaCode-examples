public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(Ecolor.RED,2,5);
        System.out.println(rectangle);
        System.out.println("perimeter = " + rectangle.getPerimeter());
        System.out.println("surface = " + rectangle.getSurface());
        System.out.println();


        Square square = new Square(Ecolor.YELLOW, 6);
        System.out.println(square);
        System.out.println("perimeter = " + square.getPerimeter());
        System.out.println("surface = " + square.getSurface());
        System.out.println();

        Triangle triangle = new Triangle(Ecolor.ORANGE, 3, 4, 5);
        System.out.println(triangle);
        System.out.println("perimeter = " + triangle.getPerimeter());
        System.out.println("surface = " + triangle.getSurface());
        System.out.println();

        Circle circle = new Circle(Ecolor.BLUE, 3);
        System.out.println(circle);
        System.out.println("perimeter = " + circle.getPerimeter());
        System.out.println("surface = " + circle.getSurface());
        System.out.println();



        AbstractShape shape1 = new Rectangle(Ecolor.RED, 2, 5);
        AbstractShape shape2 = new Square(Ecolor.YELLOW, 6);
        AbstractShape shape3 = new Triangle(Ecolor.RED, 3, 4,5 );
        AbstractShape shape4 = new Circle(Ecolor.BLUE, 3);


        AbstractShape[] abstractShapes = {shape1,shape2, shape3, shape4};

        for (AbstractShape shape: abstractShapes
             ) {
            System.out.println(shape);
            System.out.println("perimeter = " + shape.getPerimeter());
            System.out.println("surface = " + shape.getSurface());
            System.out.println();
        }

        shape1 = new Circle(Ecolor.YELLOW, 10);
        System.out.println(shape1);
    }
}
