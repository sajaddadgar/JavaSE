package Model.Repository;

import Model.Entity.Person;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sajadba5", "java123");
    }


    public String select() throws Exception{
        preparedStatement = connection.prepareStatement("select * from person");

        JSONArray jsonArray = new JSONArray();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", String.valueOf(resultSet.getLong("ID")));
            jsonObject.put("name", resultSet.getString("NAME"));
            jsonObject.put("family", resultSet.getString("FAMILY"));
            jsonObject.put("nationalCode", resultSet.getString("NATIONALCODE"));
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }

    public void insert(Person person) throws Exception{
        preparedStatement = connection.prepareStatement("insert into person (id, name, family, nationalcode) values (person_seq.nextval, ?, ?, ?)");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setString(3, person.getNationalCode());
        preparedStatement.executeUpdate();
    }

    public void update(Person person) throws Exception{
        preparedStatement = connection.prepareStatement("update person set name=?, family=? where id=?");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setLong(3, person.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(long id) throws Exception{
        preparedStatement = connection.prepareStatement("delete person where id=?");
        preparedStatement.setLong(1, id);
        preparedStatement.executeUpdate();
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
