package DAO;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {
     
   public static Connection conn;
    private String dbURL = "jdbc:mysql://localhost:3306/sqa";
    private String dbUserName="root";
    private String dbPassWord="dinhluong@1";
    public DAO() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(dbURL,dbUserName,dbPassWord);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        DAO d = new DAO();
        if(conn != null){
            System.out.println("ket noi thanh cong");
        }
        else System.out.println("ko thanh cong");
    }
    
}
