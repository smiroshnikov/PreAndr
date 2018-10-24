package vehicle;

public class Car {

    private int model;
    private String color;
    private int numberOfWheels;


    Car(int model, String color, int numberOfWheels) {
        this.model = model;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    int getNumberOfWheels() {
        return numberOfWheels;
    }
}
