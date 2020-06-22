package Main;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                Lamp.getLamp().ejra();
            }
        };


        Thread thread2 = new Thread(){
            @Override
            public void run() {
                Lamp.getLamp().ejra();
            }
        };

        thread1.start();
        thread2.start();

    }
}
