package Server;

import java.rmi.server.UnicastRemoteObject;

public class MethodsImplement extends UnicastRemoteObject implements Methods {

    public MethodsImplement() throws Exception{}

    @Override
    public Person getnewPerson() throws Exception {
        Person person = new Person();
        person.setId(12);
        person.setName("amir");
        return person;
    }
}
