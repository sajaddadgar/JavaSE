package Main;

public class Main {

    public static void main(String[] args) {


        Sajad sajad = new Sajad();
        Target target = new Target();
        AutMethodRefrence methodRefrence = target::x;

        sajad.start(methodRefrence);

    }
}
