package src.useabstract;

public class MainAbstract {
    public static void main(String[] args) {

        Customer customer = new Customer(200);
        System.out.println( customer.accountName() );
        System.out.println( customer.accountTotal() );

    }
}
