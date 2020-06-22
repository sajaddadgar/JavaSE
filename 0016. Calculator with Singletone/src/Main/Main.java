package Main;

public class Main {

    public static void main(String[] args) {

        Calculate.getCalculate().sum(12, 16);
        Calculate.getCalculate().minus(64, 7);
        Calculate.getCalculate().multiply(15, 2);

        try {
            Calculate.getCalculate().devide(15, 15);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
