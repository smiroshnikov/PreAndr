package zoo.animals;

import zoo.behavior.IAirBehaviour;

public abstract class Bird {
    IAirBehaviour flyBehaviour;

    public Bird() {

    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }


}
