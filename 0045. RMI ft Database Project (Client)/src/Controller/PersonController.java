package Controller;

import Model.Entity.Person;

import java.rmi.Remote;
import java.util.List;

public interface PersonController extends Remote {

    List<Person> getAll() throws Exception;
    void registerPerson(Person person) throws Exception;
    void changePerson(Person person) throws Exception;
    void removePerson(long id) throws Exception;

}
