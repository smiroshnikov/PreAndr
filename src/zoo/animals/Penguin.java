package zoo.animals;

import zoo.behavior.FlyNoAbility;
import zoo.behavior.FlyRocketAbility;

public class Penguin extends Bird {
    public Penguin() {
        flyBehaviour = new FlyNoAbility();
    }


    @Override
    public void display() {

    }
}
