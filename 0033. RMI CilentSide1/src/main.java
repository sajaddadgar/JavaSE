import Server.Calc;

import java.rmi.Naming;

public class main {
    public static void main(String[] args) throws Exception{

        Calc calc = (Calc) Naming.lookup("//localhost/calcService");
        System.out.println(calc.sum(12, 16));
        System.out.println(calc.multiply(25, 5));
        System.out.println(calc.minus(18, 9));
        System.out.println(calc.division(75, 3));


    }
}
