package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class main {
    public static void main(String[] args) throws Exception{

        LocateRegistry.createRegistry(1099);
        CalcImpl c = new CalcImpl();
        Naming.rebind("calcService", c);

    }
}