import java.sql.*;

public class AppInsert {
    public void insert(Statement statement){
        try{
            String query = "INSERT INTO USERS(UNIQUE_ID, NAME, EMAIL, JOB)" +
            "VALUE('U7', 'Byeongju', 'bottlepark@gmail.com','IT Billing')";
            statement.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
