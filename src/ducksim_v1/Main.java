package ducksim_v1;

/*
 *  The problem is that I cannot DENY Penguin's access to FLY() method
 *  The problem is that I cannot DENY Penguin's access to FLY() method
 * */


public class Main {
    public static void main(String[] args) {
        Bird b = new Duck();
        Duck d = new Duck();
        System.out.println("current duck positionY is " + d.getyPosition());
        d.fly();
        d.swim();
        d.swim();

        System.out.println("current duck positionY is " + d.getyPosition());

        System.out.println("================================================\n");

        Penguin p = new Penguin();
        System.out.println("current penguin positionY is " + p.getyPosition());
        p.swim();
        p.swim();
        p.swim();
        p.walk();
        System.out.println("current penguin positionY is " + p.getyPosition());
        System.out.println("current penguin positionX is " + p.getxPosition());
        p.fly();
        System.out.println("current penguin positionY is " + p.getyPosition());


    }
}
