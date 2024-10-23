package src.useabstract;

public class MainAbstract {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println( customer.accountName() );
        System.out.println( customer.accountTotal() );

    }
}
