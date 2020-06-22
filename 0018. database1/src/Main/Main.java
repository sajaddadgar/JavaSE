package Main;

import java.sql.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {

        //Locale.setDefault(Locale.ENGLISH);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sajad", "java123");


        PreparedStatement preparedStatement = connection.prepareStatement("insert into person (id, name) values (4, 'bahar')");
        preparedStatement.execute();
        preparedStatement.close();
        connection.close();


    }
}
