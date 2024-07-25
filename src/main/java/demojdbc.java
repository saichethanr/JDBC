import java.sql.*;
public  class demojdbc {
  public static void main(String [] args) throws Exception {
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
      //load and register the Driver
      Class.forName("org.postgresql.Driver");
      Connection con = DriverManager.getConnection(url,user,password);
      System.out.println("connection established");
  }
}