public class Person {
    public void personInfo(String name, String surname, String city, long phoneNumber) {
        System.out.printf("Зателефонувати громадянинові %s %s з міста %s можна за номером %d.\n",
                name, surname, city, phoneNumber);
    }

    public static void personInfoStatic(String name, String surname, String city, String phoneNumber) {
        System.out.printf("Зателефонувати громадянинові %s %s з міста %s можна за номером %s.\n",
                name, surname, city, phoneNumber);
    }
}
