package builder.pattern;

public class Builder {

    IBuilder builder;

    void setBuilder(IBuilder iBuilder) {
        this.builder = iBuilder;
    }

    void makeSUV() {
        builder.setEngine();
        builder.setGPS();
    }

    void makeTruck() {
        builder.setEngine();
    }
}
