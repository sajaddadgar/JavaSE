package Model.Repository;

import Model.Entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PersonDA {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonDA() throws Exception{
        Locale.setDefault(Locale.ENGLISH);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba2", "java123");
    }

    public List<Person> select() throws Exception{
        List<Person> personList = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
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

    public int lineNum() throws Exception{
        int i = 0;
        preparedStatement = connection.prepareStatement("select * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            i++;
        }
        return i;
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
