package View;

import Controller.PersonController;
import Entity.Person;
import Model.Service.PersonService;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = PersonService.getPersonService().selectPerson();

        System.out.print("Enter your ID -> ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println();


        Person person1 = new Person();

        for (Person person : personList) {
            if (id == person.getId()){
                person1 = person;
            }
        }


        System.out.println("Welcome to our Bank");
        System.out.println("..................................");
        System.out.println("What can i do for you?");
        System.out.println("1. Transfer Money");
        System.out.println("2. Make a new account");
        System.out.println("..................................");
        int input2 = Integer.parseInt(scanner.nextLine());

        switch (input2){

            case 1:
                Person person2 = new Person();
                System.out.print("Enter ID that you want transfer Money -> ");
                long id2 = Long.parseLong(scanner.nextLine());
                System.out.println();
                System.out.print("Enter money -> ");
                long money = Long.parseLong(scanner.nextLine());

                for (Person person : personList) {
                     if (id2 == person.getId()){
                         person2 = person;
                     }
                }

                PersonController.getPersonController().transferMoney(person1, person2, money);
                break;

            case 2:
                Person person = new Person();
                System.out.println("Enter ID -> ");
                person.setId(Long.parseLong(scanner.nextLine()));
                System.out.println("Enter Name -> ");
                person.setName(scanner.nextLine());
                System.out.println("Enter Family -> ");
                person.setFamily(scanner.nextLine());
                System.out.println("Enter Salary -> ");
                person.setSalary(Long.parseLong(scanner.nextLine()));

                PersonController.getPersonController().insertPerson(person);

        }



    }
}
