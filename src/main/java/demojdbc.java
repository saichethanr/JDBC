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
      String query = "select sname from student where sid = 1";
      //load and register the Driver
      Class.forName("org.postgresql.Driver");
      //create a connection
      Connection con = DriverManager.getConnection(url,user,password);
      Statement st = con.createStatement();
      //the execute query retunra a result set as the answer
      ResultSet result = st.executeQuery(query);

      //to check is any data is received or not we need to check if the result is valid or not so
      //this just print true or false if the data exists or not
      System.out.println(  result.next());

      //if we have to print the data
      //then we have to do one thing
      //before we fetch the data the pointer will be on the prev row of the first row hence to fetch the first row
      //using getString we nwed to use  rs.next()
      result.next();
      String name = result.getString("sname");
      System.out.println(name);
      con.close();
      System.out.println("connection close");

      System.out.println("connection established");
  }
}