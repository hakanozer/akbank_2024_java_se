package src.inheritance;

public class B extends Base {

    public B() {
        System.out.println("B constructor");
    }

    @Override
    public void write() {
        read("B Read Call");
    }
}
