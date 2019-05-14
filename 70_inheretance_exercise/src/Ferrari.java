
public class Ferrari extends Car{
    private int serviceMonths; // particular for this type of car

    public Ferrari(int serviceMonths) {
        super("Ferrari", "Pista", 5, 5, 6, true); // hard coding here, so, I deleted them form the constructor
        this.serviceMonths = serviceMonths;
    }
    public void accelerate(int rate) { //rate = different in speed from the current speed

        int newVelocity = getCurrentVelocity()+rate;
        if (newVelocity==0) {
            stop();
            setCurrentGear(1);
        }
        else if (newVelocity>0 && newVelocity <=10){
            setCurrentGear(1);
        }
        else if (newVelocity>10 && newVelocity <=20) {
            setCurrentGear(2);
        }
        else if (newVelocity>20 && newVelocity <=30) {
            setCurrentGear(3);
        }
        else {
            setCurrentGear(4);
        }

        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}//end class
