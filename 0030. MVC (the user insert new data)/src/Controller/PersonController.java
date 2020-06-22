package Controller;

import Entity.Person;
import Model.Repository.PersonDA;
import Model.Service.PersonService;

import java.sql.SQLException;

public class PersonController {

    private PersonController(){}

    private static PersonController personController = new PersonController();

    public static PersonController getPersonController() {
        return personController;
    }

    public void insertPerson(Person person) throws SQLException, ClassNotFoundException {

        if (person.getId() == 0 || person.getName().isEmpty() || person.getFamily().isEmpty()){

            System.out.println("Data is wrong...");

        }else {

            PersonService.getPersonService().insertData(person);

        }
    }
}
