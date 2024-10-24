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

        

        System.out.println(ls);
        System.out.println(arr);
    }
}
