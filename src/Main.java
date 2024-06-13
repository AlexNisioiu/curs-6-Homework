public class Main {
    public static void main(String[] args) {


        Person p = new Person();
        p.name = "Dumitru ";
        p.age = 35;
        p.married = true;

        System.out.println(p.getInformation());

        Person p2 = new Person();
        p.name = "George ";
        p.age = 25;
        p.married = false;

        System.out.println(p.getInformation());

        Person p3 = new Person();
        p.name = "Andrei ";
        p.age = 29;
        p.married = true;

        System.out.println(p.getInformation());


    }

}