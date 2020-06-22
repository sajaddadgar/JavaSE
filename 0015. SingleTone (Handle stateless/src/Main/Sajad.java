package Main;

public class Sajad {

    private Sajad(){}
    
    private static Sajad sajad = new Sajad();

    public static Sajad getInstance() {
        return sajad;
    }

    public void a(){
        System.out.println("aaaaa");
    }


    public void b(){
        System.out.println("bbbbb");
    }

}
