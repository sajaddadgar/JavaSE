package Main;

@FunctionalInterface

public interface Calc<R, P1, P2> {

    R getResult(P1 x, P2 y);

    default Integer sum1(Integer x, Integer y){
        return x+y;
    }

    static Integer sum2(Integer x, Integer y){
        return x+y;
    }
}
