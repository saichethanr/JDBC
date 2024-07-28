import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStatement {
    public static void main(String [] args) throws  Exception{
        //what if the user is entering the data which has to be inserted

        int sid = 11;
        String sname = "Mohtih";
        int marks =99;

        String url = "jdbc:postgresql://127.0.0.1:5432/practice";
        String user = "sai";
        String password = "1445";
        String query = "INSERT INTO student values (?,?,?)";


        //load and register the Driver
        Class.forName("org.postgresql.Driver");
        //create a connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("connection established");

        //using the
        //to use the external variables inside the query preparedstatement can be used
       java.sql.PreparedStatement st = con.prepareStatement(query);
       st.setInt(1,sid);
       st.setString(2,sname);
       st.setInt(3,marks);

       st.execute();
       con.close();
    }
}
