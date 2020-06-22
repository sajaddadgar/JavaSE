package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Single Abstract Method

        Cat cat =()-> System.out.println("aaaaaaaaaaaaaa");
        cat.a();

        Sajad sajad =(c)-> System.out.println("eating " + c);
        sajad.a("pizza");

        Sum sum = (x,y)-> {
            System.out.println(x+y);
            System.out.println("salam");
        };
        sum.a(15, 17);


        Sum2 sum2 = (x,y) -> x+y;
        System.out.println(sum2.a(15, 11));


        List arrayList = new ArrayList();
        arrayList.add("sajad");
        arrayList.add("mamad");
        arrayList.forEach((s)-> System.out.println(s));
    }
}
