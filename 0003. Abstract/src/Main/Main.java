package Main;

public class Main {

    public static void main(String[] args) {
        /*
	    Hana hana = new Hana();
	    hana.driving();
	    hana.football();
	    hana.eating();
	    hana.programming();
	    */

        Sajad sajad = new Sajad() {
            @Override
            public void football() {
                System.out.println("football");
            }

            @Override
            public void driving() {
                System.out.println("driving");
            }
        };

        sajad.driving();
        sajad.football();
        sajad.eating();
        sajad.programming();
    }
}
