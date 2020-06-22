package Model.Repository;

import Entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PersonDA {

    private Connection connection;
    private PreparedStatement preparedStatement;


    public PersonDA() throws ClassNotFoundException, SQLException {
        Locale.setDefault(Locale.ENGLISH);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba2", "java123");
    }

    public void insert(Person person) throws SQLException {

        preparedStatement = connection.prepareStatement("insert into person (id, name, family, salary) values (?, ?, ?, ?)");

        preparedStatement.setLong(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setLong(4, person.getSalary());
        preparedStatement.executeUpdate();

    }


    public List<Person> select() throws SQLException {

        preparedStatement = connection.prepareStatement("select * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Person> personList = new ArrayList<>();

        while (resultSet.next()){
            Person person = new Person();
            person.setId(resultSet.getLong("ID"));
            person.setName(resultSet.getString("NAME"));
            person.setFamily(resultSet.getString("FAMILY"));
            person.setSalary(resultSet.getLong("SALARY"));
            personList.add(person);
        }

        return personList;
    }


    public void close() throws SQLException {
        preparedStatement.close();
        connection.close();
    }
}


