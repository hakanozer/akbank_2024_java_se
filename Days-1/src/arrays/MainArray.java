package src.arrays;

public class MainArray {
    public static void main(String[] args) {

        // Diziler
        String[] cities = {"İstanbul", "Ankara", "Bursa", "Adana", "İzmir", "Kayseri"};

        int size = cities.length;
        System.out.println( size );
        System.out.println( cities[size-1] );

        for( int i = 0; i < 10; i++ ) {
            System.out.println("this line call - " + i);
        }

        for( int i = 0; i < cities.length; i++ ) {
            String city = cities[i];
            System.out.println(city.toUpperCase());
        }

    }
}
