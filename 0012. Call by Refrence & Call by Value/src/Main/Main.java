package Main;

public class Main {

    public static void main(String[] args) {

        /*

            tamami dataType ha va class haye ham nam dataType ha va class string
            hamegi 'Call by Value' ast.

            ArrayList 'Call by Refrence' ast

         */
        System.out.println("CALL BY VALUE...");
        int x = 12;
        change1(x);
        System.out.println("in main: " + x);

        System.out.println(".......................");

        System.out.println("CALL BY REFRENCE...");
        Hamid hamid = new Hamid();
        hamid.haircolor = "black";
        change2(hamid);
        System.out.println("in main: " + hamid.haircolor);

    }



    public static void change1(int x){
        System.out.println("before: " + x);
        x = 14;
        System.out.println("after: " + x);
    }

    public static void change2(Hamid h){
        System.out.println("before: " + h.haircolor);
        h.haircolor = "red";
        System.out.println("after: " + h.haircolor);
    }

}
