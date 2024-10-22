package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            // Create and export a remote object
            HelloImpl obj = new HelloImpl();

            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Bind the remote object in the registry with a name "Hello"
            Naming.rebind("rmi://localhost:1099/Hello", obj);

            System.out.println("RMI Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}