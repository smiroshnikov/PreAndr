package ducksim_v3;

public class MechanoDuck extends Duck {

    public MechanoDuck() {
        flyBehaviour = new FlyWithRocket();
    }

    @Override
    public void display() {
        System.out.println("Адская утка убийца трансформер");
    }
}
