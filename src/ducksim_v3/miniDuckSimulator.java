package ducksim_v3;

public class miniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        Duck rezina = new RubberDuck();
        rezina.display();
        rezina.performFly();
    }
}
