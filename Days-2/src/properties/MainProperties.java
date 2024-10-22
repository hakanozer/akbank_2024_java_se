package src.properties;

public class MainProperties {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setId(100);
        u1.setName("Ali");
        u1.setSurname("Bilmem");

        User u2 = new User();
        u2.setId(200);
        u2.setName("Bob");
        u2.setSurname("Bil");

        User[] users = {u1, u2};

        for (User item : users) {
            System.out.println( item.getId() + " " + item.getName() + " " + item.getSurname() );
        }

    }
}
