package src.useinterface;

public class MainInterface {


    public static void main(String[] args) {

        UserImpl us1 = new UserImpl();
        IUser us2 = new UserImpl();
        IProfile us3 = new UserImpl();

        call(us1);
        call(us2);

    }

    public static void call( IUser iUser ) {
        iUser.userName(100);
    }

}
