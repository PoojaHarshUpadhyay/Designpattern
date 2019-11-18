package builder.pattern;

public class TruckBuilder extends Car implements IBuilder {
    void display() {
        System.out.println("This is truck builder");
    }

    @Override
    public void setGPS() {
        System.out.println("Truck GPS is set");
    }

    @Override
    public void setEngine() {
        System.out.println("Truck Engine is set");
    }

    @Override
    public void setMusic() {
        System.out.println("Truck Music is on");
    }
}
