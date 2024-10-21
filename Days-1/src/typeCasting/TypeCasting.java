package src.typeCasting;

public class TypeCasting {

    public static void main(String[] args) {

        String stAge = "35";
        int age = Integer.parseInt(stAge);
        int sum = age + 10;
        System.out.println(sum);

        String stStatus = "true";
        boolean status = Boolean.parseBoolean(stStatus);
        System.out.println(status);

    }

}
