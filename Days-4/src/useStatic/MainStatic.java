package src.useStatic;

public class MainStatic {

    public static void main(String[] args) {

        Profile obj = new Profile();
        obj.appTitle = "Main Title";
        System.out.println( obj.appTitle );

        Profile obj2 = new Profile();
        System.out.println( obj2.appTitle );

        System.out.println( Profile.name );
        Profile.name = "Samsung";
        System.out.println( Profile.name );

    }

}
