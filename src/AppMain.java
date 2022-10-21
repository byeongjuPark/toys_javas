import java.sql.*;

public class AppMain {
    public static void main(String[] args){
        // - MySQL workbench  실행
        // - User/password와 접속 IP:port 접속
        String url = "jdbc:mysql://127.0.0.1:3306/study_sqls";
        String user = "root";
        String password = "root";
        try{
        // - database 지정
        Connection connection = DriverManager.getConnection(url, user, password);
        // query edit , 쿼리문을 실행하기 위한 변수
        Statement statement = connection.createStatement();
        new AppSelect().select(statement);
        new AppInsert().insert(statement);
        new AppUpdate().update(statement);
        
        

        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
