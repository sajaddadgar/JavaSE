package Main;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("1");
                System.out.println("2");
            }
        };


        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("1");
                System.out.println("2");
            }
        };

        thread1.start();
        thread2.start();
        System.out.println("finish");

    }
}
