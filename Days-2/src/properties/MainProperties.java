package src.properties;

public class MainProperties {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setId(100);
        u1.setName("Ali");
        u1.setSurname("Bilmem");
        String[] pic1 = {"x.jpg", "y.jpg"};
        u1.setPictures(pic1);
        Address ad1 = new Address();
        ad1.setCity("a");
        ad1.setState("a");
        ad1.setZip("a");
        u1.setAddress(ad1);


        User u2 = new User();
        u2.setId(200);
        u2.setName("Bob");
        u2.setSurname("Bil");
        String[] pic2 = {"a.jpg", "b.jpg", "c.jpg"};
        u2.setPictures(pic2);
        Address ad2 = new Address();
        u2.setAddress(ad2);

        User[] users = {u1, u2};

        for (User item : users) {
            System.out.println( item.getId() + " " + item.getName() + " " + item.getSurname() );
            System.out.println( item.getAddress().getCity() + " " + item.getAddress().getState() + " " + item.getAddress().getZip());
            for (String path : item.getPictures()) {
                System.out.println(path);
            }
        }

    }
}
