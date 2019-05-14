package oop.paquete;

public class Main {

    public static void main(String[] args) {

    Car ferrari = new Car(); // create an object of type "Car", must be initialized w/ = "new Car();"
    //Car mazda = new Car();
    //System.out.println("Model is " + ferrari.getModel()); //Output: Model is null

    ferrari.setModel("Carrera");

    System.out.println("Model is " + ferrari.getModel());



    }//end met.Main



} //end class Main
