package src.useDB;

import java.util.ArrayList;
import java.util.Random;

public class Result {

    public User rndUser() {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ahmet Yılmaz", "ahmet.yilmaz@example.com", "sifre1"));
        users.add(new User("Fatma Demir", "fatma.demir@example.com", "sifre2"));
        users.add(new User("Mehmet Özkan", "mehmet.ozkan@example.com", "sifre3"));
        users.add(new User("Ayşe Kaya", "ayse.kaya@example.com", "sifre4"));
        users.add(new User("Emre Çelik", "emre.celik@example.com", "sifre5"));
        users.add(new User("Zeynep Arslan", "zeynep.arslan@example.com", "sifre6"));
        users.add(new User("Ali Koç", "ali.koc@example.com", "sifre7"));
        users.add(new User("Elif Aydın", "elif.aydin@example.com", "sifre8"));
        users.add(new User("Canan Kaplan", "canan.kaplan@example.com", "sifre9"));
        users.add(new User("Oğuzhan Yıldız", "oguzhan.yildiz@example.com", "sifre10"));

        Random random = new Random();
        int rnd = random.nextInt(users.size());
        return users.get(rnd);
    }

}
