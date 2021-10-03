//Create a separate package and name it 'cars'
package cars;

// In this package add a class that describes a car: define its fields and methods.
public class Car {

    /*
    For this class it is mandatory to have fields manufacturer, model, engine, horsepower.
    For this class it is mandatory to have methods: run (void method, prints out "The car is running"),
    printHorsepower (void method, prints our "Car has [value of horsepower field] hp")
    You can add any other field and method you like.

    Add a new class named Car usage. Add the main method here and create 5 objects of Car class.
    Call all the methods on all 5 objects
     */

    public String manufacturer;
    public String model;
    public String engine;
    public int horsepower;

    public String color;
    public int year;
    public int speed;
    public int distanceGone; // this is a field of the number of kilometers traveled



    public void run() {
        System.out.println("The car is running");
    }

    public void printHorsepower() {
        System.out.println("Car has " + this.horsepower + " hp");
    }

    public void checkOilBalance(int distanceForChangeOil) {
        if (distanceForChangeOil > this.distanceGone) {
            System.out.println("Time to change engine oil.");
        } else {
            System.out.println("The car has not reached the required distance.");
        }
    }



}
