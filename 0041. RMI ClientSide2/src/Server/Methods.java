package Server;

import java.rmi.Remote;

public interface Methods extends Remote {

    Person getnewPerson() throws Exception;

}
