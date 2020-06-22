package Main;

import  java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first ID: ");
            String input1 = scanner.nextLine();
            System.out.println("Enter second ID: ");
            String input2 = scanner.nextLine();

            Locale.setDefault(Locale.ENGLISH);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba", "java123");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from person where id = ? or id = ?");
            preparedStatement.setString(1, input1);
            preparedStatement.setString(2, input2);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println(resultSet.getLong("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("family"));

            }

            preparedStatement.close();
        } catch (Exception e){
            System.out.println("boro bache ipitam daram...");
        }
    }
}
