package Server;

import Model.Service.PersonServiceImplement;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class main {
    public static void main(String[] args) throws Exception{

        LocateRegistry.createRegistry(1099);
        Naming.rebind("personService", new PersonServiceImplement());
        System.out.println("running....");

    }
}
