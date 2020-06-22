package Main;

public class Calculate {

    private Calculate(){}

    private static Calculate calculate = new Calculate();

    public static Calculate getCalculate(){
        return calculate;
    }

    public void sum(int x, int y){
        System.out.println(x+y);
    }

    public void minus(int x, int y){
        System.out.println(x-y);
    }

    public void multiply(int x, int y){
        System.out.println(x*y);
    }

    public void devide(int x, int y){
        System.out.println(x/y);
    }


}
