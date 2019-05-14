public class Wall {
    private double width; //instance variable
    private double height; //instance variable

    public Wall() { //no-arg constructor

    }
    public Wall(double width, double height) { // constructor has 2 parameters
        if (width<0){
            width = 0;
        }
        else {
            this.width = width;
        }

        if (height<0){
            height = 0;
        }
        else {
            this.height = height;
        }

    }
// instance methods
    public void setWidth(double width) {
        if (width<0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height<0){
            height = 0;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        double wallArea = getWidth() * getHeight();
        return wallArea;
    }
}
