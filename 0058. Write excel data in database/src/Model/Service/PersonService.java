package Model.Service;

import Model.Entity.Person;
import Model.Repository.PersonDA;

public class PersonService {
    
    private PersonService(){}
    private static PersonService personService = new PersonService();

    public static PersonService getInstance() {
        return personService;
    }
    
    public void registerPerson(Person person) throws Exception{
        PersonDA personDA = new PersonDA();
        personDA.insert(person);
        personDA.close();
    }
    
}
