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
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba3", "java123");
    }


    public List<Person> select() throws Exception{
        preparedStatement = connection.prepareStatement("select * from person");
        List<Person> personList = new ArrayList<>();
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

    public void insert(Person person) throws Exception{
        preparedStatement = connection.prepareStatement("insert into person (id, name, family, salary) values (person_seq.nextval, ?, ?, ?)");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setLong(3, person.getSalary());
        preparedStatement.executeUpdate();
    }

    public void update(Person person) throws Exception{
        preparedStatement = connection.prepareStatement("update person set name = ?, family = ?, salary = ? where id = ?");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setLong(3, person.getSalary());
        preparedStatement.setLong(4, person.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(long id) throws Exception{
        preparedStatement = connection.prepareStatement("delete person where id = ?");
        preparedStatement.setLong(1, id);
        preparedStatement.executeUpdate();
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
