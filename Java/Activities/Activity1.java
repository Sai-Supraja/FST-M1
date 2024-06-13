package Activities;

class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        this.tyres= 4;
        this.doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("Color of the Car: "+color);
        System.out.println("Transmission of the Car: "+transmission);
        System.out.println("make of the Car: "+make);
        System.out.println("Tyres of the Car: "+tyres);
        System.out.println("Doors of the Car: "+doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }

}

public class Activity1{
    public static void main(String[] args) {
        Car car = new Car();
        car.make = 2014;
        car.color = "Black";
        car.transmission = "Manual";

        car.displayCharacteristics();
        car.accelerate();
        car.brake();
    }
}
