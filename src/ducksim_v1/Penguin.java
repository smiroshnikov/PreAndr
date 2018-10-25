package ducksim_v1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly !!! ");
        throw new NotImplementedException();
    }
}
