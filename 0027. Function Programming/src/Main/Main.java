package Main;

public class Main {

    public static void main(String[] args) {

        Calc<Integer, Integer, Integer> jam = Calc::sum2;
        System.out.println(jam.getResult(12, 15));

        Calc<Integer, Integer, Integer> menha = (x, y) -> x-y;
        System.out.println(menha.getResult(12, 15));

        Calc<Integer, Integer, Integer> zarb = (x, y) -> x*y;
        System.out.println(zarb.getResult(12, 15));

        Calc<Integer,Integer,Integer> taghsim=(x,y)->x/y;
        System.out.println(taghsim.getResult(12, 15));

    }
}
