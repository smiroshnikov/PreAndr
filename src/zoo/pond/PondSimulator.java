package zoo.pond;

import zoo.animals.Bird;
import zoo.animals.Duck;
import zoo.animals.Penguin;

public class PondSimulator {
    public static void main(String[] args) {
        Bird p = new Penguin();
        p.performFly();
        Bird d = new Duck();
        d.performFly();
    }
}
