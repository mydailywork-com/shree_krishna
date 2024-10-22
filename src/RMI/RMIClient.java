package RMI;

import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // Lookup the remote object in the RMI registry
            Hello obj = (Hello) Naming.lookup("rmi://localhost:1099/Hello");

            // Call the remote method and print the result
            String message = obj.sayHello();
            System.out.println("Message from server: " + message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
