package src.constructor;

public class DB {

    // Kurucu methodlar
    // sınıf adı ile aynı isme sahip olmalıdır.
    // void yada return anahtar kelimesi alamazlar.
    private EDB dbName = EDB.Mysql;

    public DB() {
        System.out.println("DB Constructor");
        write();
    }

    public DB(EDB dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        if (dbName == EDB.Mysql) {
            System.out.println("Connecting to database Mysql");
        }else if (dbName == EDB.Oracle) {
            System.out.println("Connecting to database Oracle");
        }else if (dbName == EDB.SQLServer) {
            System.out.println("Connecting to database SQLServer");
        }else if (dbName == EDB.H2) {
            System.out.println("Connecting to database H2");
        }else{
            System.out.println("Connecting Fail to Database");
        }
    }

    public void write() {
        System.out.println("write call");
    }

}
