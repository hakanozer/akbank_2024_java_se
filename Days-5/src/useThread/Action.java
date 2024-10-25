package src.useThread;

public class Action extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("Image Upload..");
            }
            System.out.println("Image Upload Finish");
        }catch (Exception e) {
            System.err.println("run error :" + e.getMessage());
        }
    }

}
