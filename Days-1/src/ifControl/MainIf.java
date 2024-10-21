package src.ifControl;

public class MainIf {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        boolean status = a > b;
        status = b > a;
        status = b < a;
        status = a == b;
        status = a != b;

        if ( status ) {
            System.out.println("b > a");
        }else {
            System.out.println("b < a");
        }

        // || -> veya
        // sol taraftaki şart veya sağ taraftaaki şartın sağlanması durumu
        status = a > 9 || a > b;
        System.out.println("|| Status: " + status);

        // && -> ve
        // sol taraftaki şart ile sağ taraftaaki şartın sağlanması durumu
        status = a > 9 && a > b;
        System.out.println("&& Status: " + status);
        if (a > 9 && a > b && a > 10 && b > a) {

        }

        String aa = "a";
        String bb = "a";

        String username = "ali01";
        String password = "12345";

        System.out.println(username.hashCode());
        System.out.println(password.hashCode());

        if( username.equals("ali01") && password.equals("12345") ) { // username == "ali01"
            System.out.println("Login Success");
        }else {
            System.out.println("Login Failed");
        }


        // else - if
        String name = "Ali";
        String surname = "Bilmem";
        String email = "ali@mail.com";

        if (name.equals("")) {
            System.out.println("Name Fail");
        } else if (surname.equals("")) {
            System.out.println("Surname Fail");
        }else if (email.equals("")) {
            System.out.println("Email Fail");
        }else {
            System.out.println("Form Success");
        }


        // swicth
        String day = "Salı";
        switch (day) {
            case "Pazartesi":
                System.out.println("Pazartesi");
            break;
            case "Salı":
                System.out.println("Salı");
            break;
            case "Çarşamba":
                System.out.println("Çarşamba");
            break;
            default:
                System.out.println("Day Fail");
        }


    }

}
