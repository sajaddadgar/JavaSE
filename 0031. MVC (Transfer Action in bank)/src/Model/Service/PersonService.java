package Model.Service;

import Entity.Person;
import Model.Repository.PersonDA;

import java.sql.SQLException;
import java.util.List;

public class PersonService {

    private PersonService(){}
    private static PersonService personService = new PersonService();

    public static PersonService getPersonService() {
        return personService;
    }

    public void insertPerson(Person person) throws SQLException, ClassNotFoundException {
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

    public void transferMoney(Person person1, Person person2, long money) throws SQLException, ClassNotFoundException {

        PersonDA personDA = new PersonDA();
        person1.setSalary(person1.getSalary() - money);
        personDA.updateSalary(person1);

        person2.setSalary(person2.getSalary() + money);
        personDA.updateSalary(person2);

        personDA.close();

    }
}
