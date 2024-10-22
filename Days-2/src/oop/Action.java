package src.oop;

public class Action {

    public String name = "Erkan";
    public String surname = "Bilmem";
    public int number = 10;

    public void noParameter() {
        System.out.println("No parameter");
    }

    public void sum( int number1, int number2 ) {
        int sm = number1 + number2;
        System.out.println("Sum: " + sm);
    }

    public void sum( int number1 ) {
        System.out.println("Sum: " + number1);
    }

    public boolean userLogin( String username, String password ) {
        boolean status = false;
        if ( username.equals("ali01") && password.equals("12345") ) {
            status = true;
        } else if (username.equals("veli01") && password.equals("12345")) {
            status = true;
        }
        if (status) {
            System.out.println("Welcome");
        }
        return status;
    }

    public void addAddress( int userID, String... lines ) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println( userID + " - " + lines[i] );
        }
    }

    public String[] cities( String[] citiesArr ) {
        for (int i = 0; i < citiesArr.length; i++) {
            citiesArr[i] = i + " - " + citiesArr[i];
        }
        return citiesArr;
    }

}
