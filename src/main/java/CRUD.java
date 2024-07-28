import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUD {
    public static void main(String [] args) throws  Exception{
           /*
      import the pakage
      load and register
      create connection
      create a statment
      execute the statement
      process results
      close
      */

        String url = "jdbc:postgresql://127.0.0.1:5432/practice";
        String user = "sai";
        String password = "1445";
        String query1 = "INSERT INTO student values  (7,'Kiran',48)";
        String query2 = "UPDATE  student SET sname='Karan' where sid=3";
        String query3 = "DELETE FROM student where sid=5";
        //load and register the Driver
        Class.forName("org.postgresql.Driver");
        //create a connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("connection established");
        Statement st = con.createStatement();
        //executequery is used when we want to get data
        //the execute is used to insert the date into the table
        //it will return false if executed any insert update or delete query
        boolean state =  st.execute( query2);
        System.out.println(state);


        con.close();
        System.out.println("connection close");
    }
}
