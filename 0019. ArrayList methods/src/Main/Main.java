package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List arrayList = new ArrayList();
        arrayList.add("sajad");
        arrayList.add("hossein");
        arrayList.add("mohammad");
        arrayList.add("ahmad");

        arrayList.stream().forEach((p) -> System.out.println(p));
        System.out.println("....................................");
        arrayList.stream().sorted().forEach((p) -> System.out.println(p));
        System.out.println("....................................");
        arrayList.stream().sorted().filter((p) -> p.equals("sajad")).forEach((p) -> System.out.println(p));
        System.out.println("....................................");



        // example2
        Person person1 = new Person("A", "B");
        Person person2 = new Person("AA", "B");
        Person person3 = new Person("C", "D");
        Person person4 = new Person("CC", "DD");

        List<Person> arrayList2 = new ArrayList();
        arrayList2.add(person1);
        arrayList2.add(person2);
        arrayList2.add(person3);
        arrayList2.add(person4);

        arrayList2.stream()
                .filter((p) -> p.getName().contains("A"))
                .map((p) -> p.getName()).
                forEach((name) -> System.out.println(name));

    }
}
