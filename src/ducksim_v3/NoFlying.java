package ducksim_v3;

public class NoFlying implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
}
