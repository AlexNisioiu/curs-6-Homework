public class Person {

    String name;
    int age;
    boolean married;

     String getName() {
        return name;
    }

     int getAge() {
        return age;
    }

     boolean isMarried() {
        return married;
    }

    String getInformation(){
         return getName() + getAge() + " " + isMarried();
    }
}
