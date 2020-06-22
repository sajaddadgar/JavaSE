package Model.Service;

import Model.Entity.Person;
import Model.Repository.PersonDA;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class PersonServiceImplement extends UnicastRemoteObject implements PersonService {

    public PersonServiceImplement() throws Exception{}

    @Override
    public List<Person> getAll() throws Exception {
        System.out.println("getALl method called...");
        PersonDA personDA = new PersonDA();
        List<Person> personList = personDA.select();
        personDA.close();
        return personList;
    }

    @Override
    public void registerPerson(Person person) throws Exception {
        System.out.println("registerPerson method called...");
        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }

    @Override
    public void changePerson(Person person) throws Exception {
        System.out.println("changePerson method called...");
        PersonDA personDA = new PersonDA();
        personDA.update(person);
        personDA.close();
    }

    @Override
    public void removePerson(long id) throws Exception {
        System.out.println("removePerson method called...");
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
        personDA.close();
    }
}
