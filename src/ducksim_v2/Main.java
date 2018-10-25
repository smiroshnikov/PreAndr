package ducksim_v2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MallardDuck m1 = new MallardDuck();
        RedheadDuck r1 = new RedheadDuck();
        WoodenDuck w1 = new WoodenDuck();
        RubberDuck rb1 = new RubberDuck();

        ArrayList<Duck> duckList = new ArrayList<>();
        duckList.add(m1);
        duckList.add(r1);
        duckList.add(rb1);
        duckList.add(w1);
        for (Duck element  : duckList) {
            element.display();

        }






    }
}
