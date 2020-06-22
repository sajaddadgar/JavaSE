package Main;

public class Main {

    public static void main(String[] args) {


        Sajad sajad = new Sajad() {
            @Override
            public void a() {
                System.out.println("a");
            }

            @Override
            public void b() {
                System.out.println("b");
            }
        };

        sajad.z();
        Sajad.m();

    }
}
