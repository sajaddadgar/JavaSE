package Main;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        /*
        Supplier supplier = Sajad::new;
        Sajad sajad = (Sajad) supplier.get();
        sajad.x();
        */

        AutSupp autSupp = Sajad::new;
        Sajad sajad = (Sajad) autSupp.begir("bahar");
        sajad.x();
    }
}
