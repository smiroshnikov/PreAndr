package ducksim_v3;

public abstract class Duck {
    IFlyBehaviour flyBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }
    // add swim and walk


}
