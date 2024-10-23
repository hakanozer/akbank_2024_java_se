package src.useabstract;

public class Customer extends Person {

    int accountNumber = 0;
    public Customer(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int accountNumber() {
        return accountNumber;
    }

}
