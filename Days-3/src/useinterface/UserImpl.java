package src.useinterface;

public class UserImpl implements IUser, IProfile {

    @Override
    public String profileName(int userID) {
        return "";
    }

    @Override
    public boolean userLogin(String username, String password) {
        return false;
    }

    @Override
    public String userName(int userID) {
        return "";
    }
}
