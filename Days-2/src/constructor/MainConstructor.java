package src.constructor;

public class MainConstructor {

    public static void main(String[] args) {

        DB db = new DB(EDB.SQLServer);
        db.connect();

    }

}
