package ducksim_v3;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new NoFlying();
    }

    @Override
    public void display() {
        System.out.println("New Sex Toy - Rubber duck!");

    }
}
