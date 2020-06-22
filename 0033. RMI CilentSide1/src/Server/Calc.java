package Server;

import java.rmi.Remote;

public interface Calc extends Remote {

    int sum(int x, int y) throws Exception;
    int minus(int x, int y) throws Exception;
    int multiply(int x, int y) throws Exception;
    int division(int x,int y) throws Exception;


}
