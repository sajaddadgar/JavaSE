package View;

import Controller.PersonController;
import Entity.Person;
import Model.Service.PersonService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

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
