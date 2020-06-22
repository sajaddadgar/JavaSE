package Model.Service;

import Entity.Person;
import Model.Repository.PersonDA;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private PersonService(){}

    private static PersonService personService = new PersonService();

    public static PersonService getPersonService() {
        return personService;
    }

    public void insertData(Person person) throws SQLException, ClassNotFoundException {

        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }

    public List<Person> selectPerson() throws SQLException, ClassNotFoundException {
        PersonDA personDA = new PersonDA();
        List<Person> personList = personDA.select();
        personDA.close();
        return personList;
    }

}
