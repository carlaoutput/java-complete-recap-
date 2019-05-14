package oop.paquete;

public class Car { //public = unrestricted access to this class


    private int doors; // variables, characteristics of car only available inside the Car.java class
    private int wheels;
    public String model; //I have "model" variable or field (object) and "model" parameter, differentiate both using "this"
    private String engine; // remember that String is a class, doesn't need to be created
    private String colour; //String class too

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("miato")) {
            this.model = model; // "this" for referring to "model" variable or field of the class.
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}//end class Car
