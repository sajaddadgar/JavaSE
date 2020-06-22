package View;

import Controller.PersonController;
import Model.Entity.Person;

import java.rmi.Naming;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{

        PersonController personController = (PersonController) Naming.lookup("//localhost/personService");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome");
        System.out.println("---------------------------------------");
        System.out.println("1. new account");
        System.out.println("2. update data");
        System.out.println("3. search");
        System.out.println("4. delete account");
        System.out.println("---------------------------------------");
        System.out.print("What can i do for you? ");
        int a = Integer.parseInt(scanner.nextLine());

        switch (a){

            case 1:
                Person person = new Person();
                System.out.print("Name-> ");
                person.setName(scanner.nextLine());
                System.out.print("Family-> ");
                person.setFamily(scanner.nextLine());
                long familyCode = Long.parseLong(String.format("%04d", random.nextInt(10000)));
                person.setCode(familyCode+1);
                personController.registerPerson(person);

                System.out.println("---------------------------------------");
                System.out.print("how many relative-> ");
                int r = Integer.parseInt(scanner.nextLine());
                System.out.println("---------------------------------------");
                for (int i = 0; i < r; i++){
                    Person person1 = new Person();
                    System.out.print("Name-> ");
                    person1.setName(scanner.nextLine());
                    System.out.print("Family-> ");
                    person1.setFamily(scanner.nextLine());
                    person1.setCode(familyCode);
                    personController.registerPerson(person1);
                    System.out.println("---------------------------------------");
                }
                break;

            case 2:

                //Person person1 = new Person();
                System.out.print("Enter your ID -> ");
                String id = scanner.nextLine();
                List<Person> personList = personController.getAll();
                for (Person person2 : personList) {
                    if (Long.parseLong(id) == person2.getId()){
                        System.out.print("Enter new Name-> ");
                        person2.setName(scanner.nextLine());
                        System.out.print("Enter new Family-> ");
                        person2.setFamily(scanner.nextLine());
                        System.out.print("Enter new Code-> ");
                        person2.setCode(Long.parseLong(scanner.nextLine()));
                        personController.changePerson(person2);
                    }
                }

                break;



            case 3:
                List<Person> personList1 = personController.getAll();
                System.out.print("Did you make the account? [yes or no]");
                String str = scanner.nextLine();
                System.out.print("Enter your code: ");
                long code1 = Long.parseLong(scanner.nextLine());
                System.out.println("---------------------------------------");

                if (str.toLowerCase().equals("no")){
                    for (Person person2 : personList1) {
                        if(person2.getCode() == code1 + 1){
                            System.out.println(person2.getName());
                            System.out.println(person2.getFamily());
                            System.out.println("---------------------------------------");
                        }
                    }
                } else if (str.toLowerCase().equals("yes")){

                    for (Person person2 : personList1) {
                        if(person2.getCode() == code1 - 1){
                            System.out.println(person2.getName());
                            System.out.println(person2.getFamily());
                            System.out.println("---------------------------------------");
                        }
                    }

                }
                break;

            case 4:
                System.out.print("Enter your ID-> ");
                personController.removePerson(Long.parseLong(scanner.nextLine()));
                break;


            default:
                System.out.println("number is wrong.");
        }

    }
}
