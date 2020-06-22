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

    public String getAll() throws Exception{
        PersonDA personDA = new PersonDA();
        String personList = personDA.select();
        personDA.close();
        return personList;
    }

    public void registerPerson(String name, String family, String nationalCode) throws Exception{
        PersonDA personDA = new PersonDA();
        Person person = new Person(name, family, nationalCode);
        personDA.insert(person);
        personDA.close();
    }

    public void changePerson(long id, String name, String family) throws Exception{
        PersonDA personDA = new PersonDA();
        Person person = new Person(id, name, family);
        personDA.update(person);
        personDA.close();
    }

    public void removePerson(long id) throws Exception{
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
        personDA.close();
    }

}
