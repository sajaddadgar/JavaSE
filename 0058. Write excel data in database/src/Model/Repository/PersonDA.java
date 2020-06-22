package Model.Repository;

import Model.Entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Locale;

public class PersonDA {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonDA() throws Exception{
        Locale.setDefault(Locale.ENGLISH);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba2", "java123");
    }

    public void insert(Person person) throws Exception{
        preparedStatement = connection.prepareStatement("insert into person (id, name, family, salary) values (?, ?, ?, ?)");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setLong(4, person.getSalary());
        preparedStatement.executeUpdate();
    }

    public void close()throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
