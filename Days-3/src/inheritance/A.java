package src.inheritance;

public class A extends Base {

    public A() {
        System.out.println("A constructor");
    }

    @Override
    public void write() {
        read("A Read Call");
    }

    public int sum(int a, int b) {
        return a + b;
    }

}
