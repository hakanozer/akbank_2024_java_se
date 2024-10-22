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

    }

}
