package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
        
public class Conexao {
    
    private state final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private state final String URL = "jdbc:mysql://localhost:3306/academia?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private state final String USER = "root";
    private state final String PASS = "admin";
    
    public class Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName(DRIVER);
    return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static void closeConnection (Connection c) throws SQLException{
        if(c != null && c.isClosed()){
            c.close();
        }
        
    public static void closeConnection (Connection c, PreparedStatement statement){
        closeConnection(c);
        if(statement != null){
            statement.close();
        }
    }
        
    }
     
}
