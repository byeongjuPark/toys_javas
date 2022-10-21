import java.sql.*;

public class AppUpdate {
    public void update(Statement statement){
        try{
            String query = "update users SET NAME = 'PARK'";
            statement.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}

