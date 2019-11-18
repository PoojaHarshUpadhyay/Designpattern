package builder.pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Builder builder = new Builder();
        CarBuilder carBuilder = new CarBuilder();
        builder.setBuilder(carBuilder);
        builder.makeSUV();
        carBuilder.display();

        TruckBuilder truckBuilder = new TruckBuilder();
        builder.setBuilder(truckBuilder);
        builder.makeTruck();
        truckBuilder.setEngine();
        truckBuilder.display();

    }
}
