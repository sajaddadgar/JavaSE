package Main;

public class Main {

    public static void main(String[] args) {

        Hojat d = new Sajad();
        d.execute();
        ((Sajad) d).programming();

        Sajad s = (Sajad) d;
        s.programming();


    }
}
