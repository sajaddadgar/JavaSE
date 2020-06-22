package Main;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Sajad sajad = new Sajad();
        sajad.haircolor = "red";
        change((Sajad) sajad.clone());
        System.out.println("in main: " + sajad.haircolor);

    }


    public static void change(Sajad s){
        System.out.println("before: " + s.haircolor);
        s.haircolor = "black";
        System.out.println("after: " + s.haircolor);
    }
}
