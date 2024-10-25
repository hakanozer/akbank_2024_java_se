package src.useDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public CustomerService(){
        init();
    }

    private void init() {
        String customerSql = "create table if not exists customer(\n" +
                "\tcid int auto_increment primary key,\n" +
                "\tname varchar(200),\n" +
                "\temail varchar(200),\n" +
                "\tpassword varchar(200)\n" +
                ")\n";
        DB db = new DB();
        try {
            Statement stmt = db.getConnection().createStatement();
            stmt.executeUpdate(customerSql);
        }catch (Exception ex) {
            System.err.println("init error :" + ex.getMessage());
        }finally {
            db.close();
        }
    }

    public int save( String name,  String email, String password ) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "insert into customer(name,email,password) values(?,?,?)";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            status = pstmt.executeUpdate();
        }catch (Exception ex) {
            System.err.println("save error :" + ex.getMessage());
        }finally {
            db.close();
        }
        return status;
    }

    public int delete( int cid ) {
        DB db = new DB();
        int status = 0;
        try {
            String deleteSql = "delete from customer where cid=?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(deleteSql);
            pstmt.setInt(1, cid);
            status = pstmt.executeUpdate();
        }catch (Exception ex) {
            System.err.println("delete error :" + ex.getMessage());
        }finally {
            db.close();
        }
        return status;
    }

    public List<User> selectAll() {
        DB db = new DB();
        List<User> users = new ArrayList<User>();
        try {
            String sql = "select * from customer";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");

                User user = new User();
                user.setCid(cid);
                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
                users.add(user);
            }
        }catch (Exception ex) {
            System.err.println("selectAll error :" + ex.getMessage());
        }finally {
            db.close();
        }
        return users;
    }


}
