package Main;

public class Main {

    public static void main(String[] args) {

         PersonManager personManager1 = new PersonManager();
        PersonManager personManager2 = new PersonManager();

        personManager1.haircolor = "red";
        personManager2.haircolor = "black";

        personManager1.age = 13;
        personManager2.age = 30;

        PersonManager.age = 90;

        System.out.println(personManager1.haircolor);
        System.out.println(personManager2.haircolor);

        System.out.println(personManager1.age);
        System.out.println(personManager2.age);
        System.out.println(PersonManager.age);
    }
}
