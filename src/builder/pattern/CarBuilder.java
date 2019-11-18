package builder.pattern;

public class CarBuilder extends Car implements IBuilder {
    void display() {
        System.out.println("This is car builder");
    }

    @Override
    public void setGPS() {
        System.out.println("Car GPS is set");
    }

    @Override
    public void setEngine() {
        System.out.println("Car Engine is set");
    }

    @Override
    public void setMusic() {
        System.out.println("Car Music is on");
    }
}
