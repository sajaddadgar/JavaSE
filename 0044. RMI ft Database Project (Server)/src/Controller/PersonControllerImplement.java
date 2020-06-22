package Controller;

import Model.Entity.Person;
import Model.Service.PersonService;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class PersonControllerImplement extends UnicastRemoteObject implements PersonController {

    public PersonControllerImplement() throws Exception{}

    @Override
    public List<Person> getAll() throws Exception {
        System.out.println("getAll method called...");
        List<Person> personList = PersonService.getInstance().getAll();
        return personList;
    }

    @Override
    public void registerPerson(Person person) throws Exception {
        System.out.println("registerPerson method called...");
        if (person.getName().isEmpty() && person.getFamily().isEmpty() && person.getCode() == 0){
            System.out.println("data is wrong :(");
        } else {
            PersonService.getInstance().registerPerson(person);
        }

    }

    @Override
    public void changePerson(Person person) throws Exception {
        System.out.println("changePerson method called...");
        if (person.getName().isEmpty() && person.getFamily().isEmpty() && person.getCode() == 0){
            System.out.println("data is wrong :(");
        } else {
            PersonService.getInstance().changePerson(person);
        }
    }

    @Override
    public void removePerson(long id) throws Exception {
        System.out.println("removePerson method called...   ");
        PersonService.getInstance().removePerson(id);
    }
}
