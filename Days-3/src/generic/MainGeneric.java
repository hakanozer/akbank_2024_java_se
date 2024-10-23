package src.generic;


public class MainGeneric {
    public static void main(String[] args) {

        Action<String> action = new Action();

        action.add("Zehra");
        action.add("Ali");
        action.add("Mehmet");
        action.add("Mehmet");
        action.add("Mehmet");
        action.add("Mehmet");
        action.add("Arda");
        action.add("Ayşe");
        action.add("Ahmet");

        String deleteData = action.remove(13);
        System.out.println(deleteData);
        System.out.println( action.list() );


    }
}
