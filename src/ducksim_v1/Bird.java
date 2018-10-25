package ducksim_v1;

abstract class Bird implements IFly, IWalk, ISwim {
    int xPosition = 0;
    int yPosition = 0;

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void fly() {
        yPosition = +10;
        System.out.println("Flap Flap ... ");
    }

    @Override
    public void swim() {
        System.out.println("Bulk Bulk...");
        yPosition -= 10;
    }

    @Override
    public void walk() {
        xPosition += 10;
        System.out.println("Top top....");
    }
}
