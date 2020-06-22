package Main;

import Model.AUT;
import Model.Sajad;

public class Main {

    public static void main(String[] args) {

        Sajad sajad = new Sajad();

        AUT aut = sajad.getClass().getAnnotation(AUT.class);

        System.out.println(aut.developer());
        System.out.println(aut.creationDate());

    }
}
