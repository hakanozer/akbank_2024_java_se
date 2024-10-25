package src.useDB;

import java.util.List;

public class MainDB {

    public static void main(String[] args) {

        User user = new Result().rndUser();
        CustomerService customerService = new CustomerService();
        int saveStatus = customerService.save(user.getName(), user.getEmail(), user.getPassword());
        System.out.println("saveStatus: " + saveStatus);

        int deleteStatus = customerService.delete(1);
        System.out.println("deleteStatus: " +deleteStatus);

        List<User> users = customerService.selectAll();
        System.out.println("users: " + users);
    }

}
