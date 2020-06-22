package Main;

public class Lamp {

    private Lamp(){}
    private static Lamp lamp = new Lamp();

    public static Lamp getLamp() {
        return lamp;
    }

    public void ejra() {

        synchronized (this) {


            System.out.println("roshan");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("khamoosh");

        }
    }
}
