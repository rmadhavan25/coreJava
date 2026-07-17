import java.lang.*;

public class Oops {

    public static void main(String[] args) {
        Car carObj = new Car();
        assert carObj.model.equals("Unknown");
        assert carObj.year == 0;

        Car carObj2 = new Car("Toyota", 2020);
        assert carObj2.model.equals("Toyota");
        assert carObj2.year == 2020;

        Car carObj3 = new Car(carObj2);
        assert carObj3.model.equals("Toyota");
        assert carObj3.year == 2020;

//-------------------------------------------------------------------------
        Vehicle bike = new Bike();
        assert bike instanceof Bike;
        bike.start();

//-------------------------------------------------------------------------
    }
}

class Car{
    public String model = "";
    public int year = 0;

    Car(){
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    Car(Car car){
        this.model = car.model;
        this.year = car.year;
    }
}

class Vehicle{
    public void start(){
        System.out.println("parent start");
    }

    public void stop(){
        System.out.println("parent stop");
    }
}

class Bike extends Vehicle{

    @Override
    public void start() {
        super.start();
        System.out.println("child start");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("child stop");
    }
}