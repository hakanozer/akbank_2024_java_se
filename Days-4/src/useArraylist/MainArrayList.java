package src.useArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {

        String[] arr = {"City-1", "City-2", "City-3", "City-4", "City-5"};

        //ArrayList<String> list = new ArrayList<>();
        List<String> ls = new ArrayList<>();

        // Add item
        ls.add("Ali");
        ls.add("Veli");
        ls.add("Zehra");
        ls.add("Ayşe");
        ls.add("Arya");
        ls.add("Kaan");
        ls.add("Berk");
        ls.add("Emel");

        /*
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Name?");
            String name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }
            ls.add(name);
        }
         */

        // add index
        ls.add(2, "Erkan");

        // remove
        int size = ls.size();
        int deleteIndex = -1;
        if (size > deleteIndex && deleteIndex > -1) {
            ls.remove(deleteIndex);
        }
        ls.remove("Aryax");
        //ls.removeIf( item -> item.contains("a") );
        //ls.clear();

        // for
        for (int i = 0; i < ls.size(); i++) {
            String item = ls.get(i);
            System.out.println(item);
        }
        System.out.println("==================");
        for (String item : ls) {
            System.out.println(item);
        }

        System.out.println("==================");
        boolean containsStatus = ls.contains("Veli");
        System.out.println(containsStatus);

        int indexFind = ls.indexOf("Arya");
        System.out.println(indexFind);

        // set
        ls.set(2, "Ahmet");

        System.out.println("==================");
        System.out.println(ls);
        System.out.println(arr);
        System.out.println("==================");

        List<User> users = new ArrayList<>();
        User u1 = new User("Ali", "Bil", 33);
        User u2 = new User("Veli", "Bilirim", 24);
        User u3 = new User("Zehra", "Bilsin", 22);

        users.add(u1);
        users.add(u1);
        users.add(u1);
        users.add(u2);
        users.add(u2);
        users.add(u3);
        users.add(u3);
        System.out.println(users);


    }
}
