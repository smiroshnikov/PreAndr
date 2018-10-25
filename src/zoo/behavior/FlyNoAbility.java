package zoo.behavior;

public class FlyNoAbility implements IAirBehaviour {
    @Override
    public void fly() {
        System.out.println("Unable to Fly!");

    }
}
