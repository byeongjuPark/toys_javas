import java.sql.*;

public class App {
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
        //- SELECT * FROM users ;
        String query = "SELECT * FROM users";
        ResultSet resultSet = statement.executeQuery(query);

        //String query = "INSERT INTO USERS(UNIQUE_ID, NAME, EMAIL, JOB)" + "VALUE('U6', 'Byeongju', 'bottlepark@gmail.com','IT Billing')";
        //statement.execute(query);
        // - 결과 출력
        // while(resultSet.next()){
        //     System.out.print(resultSet.getString("UNIQUE_ID"));
        //     System.out.print(" ");
        //     System.out.print(resultSet.getString("NAME"));
        //     System.out.print(" ");
        //     System.out.print(resultSet.getString("EMAIL"));
        //     System.out.print(" ");
        //     System.out.print(resultSet.getString("JOB"));
        //     System.out.println("");
        // }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
