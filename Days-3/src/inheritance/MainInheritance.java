package src.inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        action(a);
        action(b);
        action(c);

    }

    public static void action( Base base ) {
        base.write();
    }

}
