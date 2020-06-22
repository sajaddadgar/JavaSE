package Client;

import Model.Entity.Person;
import Model.Service.PersonService;

import java.rmi.Naming;

public class main {
    public static void main(String[] args) throws Exception{

        PersonService personService = (PersonService) Naming.lookup("//localhost/personService");
        Person person = new Person("Sharbanoo", "Araghi", 142369000);
        personService.registerPerson(person);
    }
}
