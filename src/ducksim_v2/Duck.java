package ducksim_v2;

public abstract class Duck {
    public void quack() {
        System.out.println("quack quack !");
    }

    public void swim() {
        System.out.println("Bulk Bulk !");
    }

    abstract void display();
}
