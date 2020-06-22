package Main;

public class Main {

    public static void main(String[] args) {

        try {
            transfer();
        } catch (CoreBankException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void transfer() throws CoreBankException {

        int x = 100;
        if (x != 0){

            System.out.println("transfer shod");

        }
        else {

            throw new CoreBankException("mojudi kafi nist");
        }

        System.out.println("amaliat ba movafaghiat anjam shod...");

    }


}
