package src.inheritance;

public class Base {

    public Base(){
        System.out.println("Base Constructor");
    }

    public void write() {

    }

    final public void read( String data ) {
        System.out.println(data);
    }

    private void call() {
        System.out.println("call");
    }

}
