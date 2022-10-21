import java.sql.*;

public class AppSelect {
    public void select(Statement statement){
        try{

            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                System.out.print(resultSet.getString("UNIQUE_ID"));
                System.out.print(" ");
                System.out.print(resultSet.getString("NAME"));
                System.out.print(" ");
                System.out.print(resultSet.getString("EMAIL"));
                System.out.print(" ");
                System.out.print(resultSet.getString("JOB"));
                System.out.println("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
