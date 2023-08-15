public class PersonInfo {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Here is non-static method and to use it, we need " +
                "to create an object of Person class.");

        person.personInfo("Will", "Smith", "New York", 2936729462846L);
        person.personInfo("Jackie", "Chan", "Shanghai", 12312412412L);
        person.personInfo("Sherlock", "Holmes", "London", 37742123513L);

        System.out.println("\nBelow we are using static method where we don't " +
                "need to create an object of Person class to use it.");

        Person.personInfoStatic("Will", "Smith", "New York", "2936729462846");
        Person.personInfoStatic("Jackie", "Chan", "Shanghai", "12312412412");
        Person.personInfoStatic("Sherlock", "Holmes", "London", "37742123513");
    }
}
