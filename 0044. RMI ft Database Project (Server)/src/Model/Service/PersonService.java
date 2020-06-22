package Model.Service;

import Model.Entity.Person;
import Model.Repository.PersonDA;
import java.util.List;

public class PersonService {

    private PersonService(){}
    private static PersonService personService = new PersonService();

    public static PersonService getInstance() {
        return personService;
    }

    public List<Person> getAll() throws Exception {
        PersonDA personDA = new PersonDA();
        List<Person> personList = personDA.select();
        personDA.close();
        return personList;
    }


    public void registerPerson(Person person) throws Exception {
        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }


    public void changePerson(Person person) throws Exception {
        PersonDA personDA = new PersonDA();
        personDA.update(person);
        personDA.close();
    }


    public void removePerson(long id) throws Exception {
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
        personDA.close();
    }
}
