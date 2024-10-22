package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Remote object implementation class
public class HelloImpl extends UnicastRemoteObject implements Hello {

    // Constructor that throws RemoteException
    public HelloImpl() throws RemoteException {
        super();
    }

    // Implementation of the remote method
    @Override
    public String sayHello() throws RemoteException {
        return "Hello, RMI World!";
    }
}
