package Controller;

import Entity.Person;
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
            System.out.println("data is wrong...");
        }else {
            PersonService.getPersonService().insertPerson(person);
        }
    }


    public void transferMoney(Person person1, Person person2, long money) throws SQLException, ClassNotFoundException {

        if(person1.getSalary() == 0){
            System.out.println(person1.getName() + "doesn't have any money...");
        } else if (person1.getSalary() - money < 0){
            System.out.println(person1.getName() + "have less than " + money + " money");
        } else {
            PersonService.getPersonService().transferMoney(person1, person2, money);
        }


    }


}
