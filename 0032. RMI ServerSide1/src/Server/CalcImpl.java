package Server;

import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements Calc {

    public CalcImpl() throws Exception{}

    @Override
    public int sum(int x, int y) throws Exception {
        int result = x+y;
        return result;
    }

    @Override
    public int minus(int x, int y) throws Exception {
        int result = x-y;
        return result;
    }

    @Override
    public int multiply(int x, int y) throws Exception {
        int result = x*y;
        return result;
    }

    @Override
    public int division(int x, int y) throws Exception {
        int result = x/y;
        return result;
    }
}
