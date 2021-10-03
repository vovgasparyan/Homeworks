package triangles;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();

        triangle1.a = (int) (Math.random() * 10);
        triangle1.b = (int) (Math.random() * 10);
        triangle1.c = (int) (Math.random() * 10);
        System.out.println("Generated first triangle with sides: " + triangle1.a + " " + triangle1.b + " " + triangle1.c);

        triangle2.a = (int) (Math.random() * 10);
        triangle2.b = (int) (Math.random() * 10);
        triangle2.c = (int) (Math.random() * 10);
        System.out.println("Generated second triangle with sides: " + triangle2.a + " " + triangle2.b + " " + triangle2.c);

        triangle3.a = (int) (Math.random() * 10);
        triangle3.b = (int) (Math.random() * 10);
        triangle3.c = (int) (Math.random() * 10);
        System.out.println("Generated third triangle with sides: " + triangle3.a + " " + triangle3.b + " " + triangle3.c);

        System.out.println();

        HelperFunctions helpFunction = new HelperFunctions();

        if (helpFunction.checkTriangle(triangle1)) {
            helpFunction.calcPerimeterTriangle(triangle1);
            helpFunction.calcSquareTriangle(triangle1);
        } else {
            System.out.println("Generated first triangle is invalid");
        }

        System.out.println();

        if (helpFunction.checkTriangle(triangle2)) {
            helpFunction.calcPerimeterTriangle(triangle2);
            helpFunction.calcSquareTriangle(triangle2);
        } else {
            System.out.println("Generated second triangle is invalid");
        }

        System.out.println();

        if (helpFunction.checkTriangle(triangle3)) {
            helpFunction.calcPerimeterTriangle(triangle3);
            helpFunction.calcSquareTriangle(triangle3);
        } else {
            System.out.println("Generated third triangle is invalid");
        }

        System.out.println();


    }
}
