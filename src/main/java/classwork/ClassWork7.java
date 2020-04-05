package classwork;

public class ClassWork7 {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Alex", "Bondyuk", "996 380 89 51");

        System.out.println(contact1.toString());

        System.out.println(contact1.getPhoneNumber());
        contact1.setPhoneNumber("952 926 66 92");
        System.out.println(contact1.getPhoneNumber());

        Contact contact2 = new Contact("Inna", "Chashevaya", "923 222 32 64");

        System.out.println(contact2.toString());
        contact2.setSurname("Bondyuk");
        System.out.println(contact2.toString());
    }
}
