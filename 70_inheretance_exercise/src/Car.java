
public class Car extends Vehicle {

    private int wheels;  // unique fields for Cars
    private int doors;
    private int gears; // #s of gears presents in the Car
    private boolean isManual;

    private int currentGear; // current gear that the car is in at any point in time

    public Car(String name, String size, int wheels, int doors, int gears,
               boolean isManual) { // int currentGear was deleted, assuming the start position is 1
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // assuming always the start position will be 1
    }

    public void setCurrentGear(int currentGear) { // i.e to changeGear
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to : " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed+ " direction " + direction);
        move(speed, direction);
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }
}//end class
