package vehicle;

public class Motorcycle implements Vehicle {
    public void startEngine(boolean key){
        if (key) {
            System.out.println("Motorcycle engine Started");
        } else {
            System.out.println("Insert key to start");
        }
    }

    public void stopEngine(){
        System.out.println("Motorcycle engine stopped");
    }
}
