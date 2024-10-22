package src;

import src.oop.Action;

public class MainApp {

    public static void main(String[] args) {

        // Nesne Üretimi
        // ClassAdi NesneAdi = new ClassAdi();

        // ClassAdi -> Class
        // NesneAdi -> object, nesne
        // new -> aynısının kopyası - bellekte hazırlamak
        // ClassAdi() -> kurucu method

        Action action = new Action();
        action.number = 20;
        System.out.println( action.number );
        System.out.println( action.name );
        System.out.println( action.surname );

        Action action2 = new Action();
        System.out.println( action2.number );

        // Fnc Call
        action.noParameter();
        action.sum(600,788);
        action.sum(45,66);

        boolean loginStatus = action.userLogin("ali01", "12345");
        System.out.println("loginStatus: " + loginStatus);

        action.addAddress(100,"Line-1","Line-2","Line-3","Line-4");

        String[] cities = {"İstanbul", "Ankara", "Bursa", "Adana"};
        cities = action.cities(cities);
        for (String city : cities) {
            System.out.println(city);
        }

    }

}
