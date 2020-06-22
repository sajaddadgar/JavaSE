package Main;

public class Main {

    public static void test2(String str1, String str2){
        System.out.println("salam " + str1 + " " + str2);
    }

    public static void main(String[] args) {

        AUTMethodRefrence c = Main::test2;
        c.accept("sajad", "dadgar");


    }
}
