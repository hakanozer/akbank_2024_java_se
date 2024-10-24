package src.useTryCatch;

public class MainTryCatch {
    public static void main(String[] args) {

       String stAge = "30";
       try {
           // hata olma olasığı olan kodlar
           int age = Integer.parseInt(stAge);
           System.out.println(age);
       }catch (Exception ex) {
           // hata olduğunda çalışacak gövde
           System.out.println("Lütfen sayısal değer giriniz!");
           System.err.println(ex);
       }finally {
           System.out.println("this line call");
       }
       System.out.println("Pull Data :" + stAge);

       Action action = new Action();
       try {
           int num = action.write("100a");
           System.out.println(num + 10);
       }catch (Exception ex) {
           System.err.println("write error: " + ex.getMessage());
       }


    }
}
