package inheritancepack;

public class Dog extends inheritancepack.Animal {  //inherit from class Animal. 1! Call the constructor from the base class.

    private int eyes; // additional fields or characteristics specifics for this class Dog (additional)
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //"super" to call the constructor that we're extending from, and
        this.eyes = eyes;               //...replaced brain and body by 1, means all Dogs has a brain and body, we don't need to define them again.
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("private Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("public Dog.eat() called");
        chew();
        super.eat(); //call Animal.eat()
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called @");

    }

}





















