 package Main;

import java.util.function.Consumer;

public class Main {

    public static  void  test(Object o){
        System.out.println("salam " + o);
    }


    public static void main(String[] args) {

        Consumer c = Main::test;
        c.accept("sajad");

    }
}
