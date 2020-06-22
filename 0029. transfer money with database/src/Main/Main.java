package Main;

import java.util.Locale;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {


        Locale.setDefault(Locale.ENGLISH);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba1", "java123");


        connection.setAutoCommit(false);

        PreparedStatement preparedStatement = connection.prepareStatement("update person set money=money-? where id=?");
        preparedStatement.setString(1, "1000");
        preparedStatement.setString(2, "1");
        preparedStatement.executeUpdate();


        preparedStatement = connection.prepareStatement("update person set money=money+? where id=?");
        preparedStatement.setString(1, "1000");
        preparedStatement.setString(2, "2");
        preparedStatement.executeUpdate();

        connection.commit();
        preparedStatement.close();
        connection.close();

    }
}
