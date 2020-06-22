package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int x1 = Integer.parseInt(input1);
        int x2 = Integer.parseInt(input2);

        double y1 = Double.parseDouble(input1);
        double y2 = Double.parseDouble(input2);

        String str1 = String.valueOf(x1);
        String str2 = String.valueOf(x2);

        System.out.println(y1+y2);


    }
}
