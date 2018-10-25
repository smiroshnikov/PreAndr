package ducksim_v3;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("True Mallard Duck !");

    }
}
