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

    public List<Person> findAll() throws Exception{
        PersonDA personDA = new PersonDA();
        List<Person> personList = personDA.select();
        personDA.close();
        return personList;
    }

    public void remove(long id) throws Exception{
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
        personDA.close();
    }

    public void register(Person person)throws Exception{
        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }

}
