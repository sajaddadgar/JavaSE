package Main;

public class HojatFactory {

    public static Hojat getObject(int x) throws Exception{


        switch (x){

            case 1:
                return new Bahar();

            case 2:
                return new Sajad();

            default:
                throw new Exception("this class not found...");

        }

    }

}
