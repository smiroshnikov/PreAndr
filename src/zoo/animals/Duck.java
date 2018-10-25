package zoo.animals;

import zoo.behavior.FlyInnateAbility;

public class Duck extends Bird {

    public Duck(){
        flyBehaviour = new FlyInnateAbility();
    }

    @Override
    public void display() {
        
    }
}
