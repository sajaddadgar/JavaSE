package Main;

public interface Sajad {


    public void a();
    public void b();


    // DEFAULT: dar ers bari va oop sherkat mikonad va ba instance dast resi darim.
    // method
    public default void z(){
        System.out.println("zzzzzzzzzzz");
    }

    // STATIC: dar ers bari va oop sherkat nemikonamd .. va as tarigh nam inteface dast resi darim.
    // function
    public static void m(){

        System.out.println("mmmmmmmmmmmmmmm");
    }

}
