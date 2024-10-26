package src.useThread;

public class UseMainThread {
    public static void main(String[] args) {

        Action action = new Action();
        action.start();

        System.out.println("this line call");

    }
}
