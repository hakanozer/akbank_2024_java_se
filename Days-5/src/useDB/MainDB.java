package src.useDB;

public class MainDB {

    public static void main(String[] args) {

        DB db = new DB();
        db.getConnection();
        db.getConnection();
        db.getConnection();
        db.getConnection();
        db.close();
        db.getConnection();
        db.getConnection();
        db.close();

    }

}
