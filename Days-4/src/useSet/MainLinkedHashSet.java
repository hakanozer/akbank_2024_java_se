package src.useSet;

import src.useArraylist.User;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedHashSet {
    public static void main(String[] args) {

        Set<User> users = new LinkedHashSet<>();

        User u1 = new User("Ali", "Bil", 33);
        User u2 = new User("Veli", "Bilirim", 24);
        User u3 = new User("Zehra", "Bilsin", 22);
        User u4 = new User("Zehra", "Bilsin", 22);

        users.add(u1);
        users.add(u1);
        users.add(u1);
        users.add(u2);
        users.add(u2);
        users.add(u3);
        users.add(u3);
        users.add(u4);
        System.out.println(users);

    }
}
