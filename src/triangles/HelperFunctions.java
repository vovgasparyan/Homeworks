package triangles;

public class HelperFunctions {

    public boolean checkTriangle(Triangle object) {
        return object.a < object.b + object.c && object.b < object.a + object.c && object.c < object.a + object.b;
    }

    public int calcPerimeterTriangle(Triangle object) {
        int perimeter = object.a + object.b + object.c;
        System.out.println("The perimeter of this triangle is: " + perimeter);
        return perimeter;
    }

    public double calcSquareTriangle(Triangle object) {
        int a = object.a;
        int b = object.b;
        int c = object.c;
        int p = a + b + c;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("The square of this triangle is: " + square);
        return square;
    }
}
