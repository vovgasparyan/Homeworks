package cars;

public class CarUsage {
    /*
    Add a new class named Car usage. Add the main method here and create 5 objects of Car class.
    Call all the methods on all 5 objects
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.manufacturer = "BMW";
        car2.manufacturer = "Mercedes";
        car3.manufacturer = "Toyota";
        car4.manufacturer = "Lexus";
        car5.manufacturer = "UAZ";

        car1.model = "i5";
        car2.model = "E320";
        car3.model = "Rav 4";
        car4.model = "RX330";
        car5.model = "Patriot";

        car1.engine = "General Electrics";
        car2.engine = "Rolls Royce";
        car3.engine = "Engine International";
        car4.engine = "General Electrics";
        car5.engine = "UAZ engine";

        car1.horsepower = 200;
        car2.horsepower = 220;
        car3.horsepower = 250;
        car4.horsepower = 300;
        car5.horsepower = 230;

        car1.distanceGone = 12000;
        car2.distanceGone = 6500;
        car3.distanceGone = 600;
        car4.distanceGone = 10400;
        car5.distanceGone = 9800;

        car1.run();
        car2.run();
        car3.run();
        car4.run();
        car5.run();

        car1.printHorsepower();
        car2.printHorsepower();
        car3.printHorsepower();
        car4.printHorsepower();
        car5.printHorsepower();

        car1.checkOilBalance(5000);
        car2.checkOilBalance(12000);
        car3.checkOilBalance(8600);
        car4.checkOilBalance(13000);
        car5.checkOilBalance(600);
    }
}
