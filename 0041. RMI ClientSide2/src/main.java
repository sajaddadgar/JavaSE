import Server.Methods;
import Server.Person;

import java.rmi.Naming;

public class main {
    public static void main(String[] args) throws Exception {

        Methods methods = (Methods) Naming.lookup("//localhost/personService");
        Person person = methods.getnewPerson();

        System.out.println(person.getName());
        System.out.println(person.getId());

    }
}
