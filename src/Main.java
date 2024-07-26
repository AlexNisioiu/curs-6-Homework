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

        product();
        bottle();


    }

    public static void product() {

        Product pr = new Product();
        pr.name = "Minge ";
        pr.price = 10;
        pr.quantity = 20;
        pr.category = "fotbal";


        System.out.println(pr.getInformacion());

        Product pr1 = new Product();
        pr.name = "Chipsuri ";
        pr.price = 15;
        pr.quantity = 0;
        pr.category = " Mancare ";


        System.out.println(pr.getInformacion());

        Product pr2 = new Product();
        pr.name = "Manusi de portar ";
        pr.price = 25;
        pr.quantity = 0;
        pr.category = "fotbal";


        System.out.println(pr.getInformacion());
    }

    public static void bottle(){
        Bottle b = new Bottle(900);

        System.out.println(b.hasLiquid());
        System.out.println(b.availabelLiquid);
        System.out.println(b.emptyCapacity());
        System.out.println(b.isOpen());
        System.out.println(b.afterDrink());
        System.out.println(b.drink(450));


    }
}