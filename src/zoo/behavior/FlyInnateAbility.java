package zoo.behavior;

import ducksim_v3.IFlyBehaviour;

public class FlyInnateAbility implements IAirBehaviour {
    @Override
    public void fly() {
        System.out.println("Flap Flap....");

    }
}
