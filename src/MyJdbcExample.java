import java.sql.*;

public class MyJdbcExample {
    //        Create the Static final variables like DB url, username adn password:
//        1. DB_URL
    private static final String DB_URL = "jdbc:mysql://localhost:3306/aditya";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        JDBC connection steps :-

//        Step1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

//        Step2: Create a Connection object from DriverManager Class
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

//        Step3: Create Statement for executing database Query
        Statement stmt = conn.createStatement();

//        Step4: Create a Table in the Database
        String createTableSql = "CREATE TABLE emp (id INTEGER NOT NULL, name varchar(20), age INTEGER, PRIMARY KEY (id))";
        stmt.executeUpdate(createTableSql);
        System.out.println("Table Created successfully");

//        Step5: Insert Data into the table
        String insertDataInTableSql = "INSERT INTO emp (id, name, age) VALUES (1, 'John Doe', 30)";
        stmt.executeUpdate(insertDataInTableSql);
        System.out.println("First Record inserted into table");
        String insertSecondDataInTableSql = "INSERT INTO emp (id, name, age) VALUES (2, 'Shashi Bhushan Kumar', 23)";
        stmt.executeUpdate(insertSecondDataInTableSql);
        System.out.println("Second Record inserted into table");

//        Step5: Fetch data from Database
        String selectQuerySql = "SELECT * FROM emp";
        ResultSet rs = stmt.executeQuery(selectQuerySql);

//        Printing the data fetched from Database
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            System.out.println("ID: " + id + " Name is: " + name + " Age is: " + age);
        }

//        String deleteTable = "DROP TABLE emp";
//        stmt.executeUpdate(deleteTable);

//        Close the connection
        conn.close();
        stmt.close();
        rs.close();
    }
}
