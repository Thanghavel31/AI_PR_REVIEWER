import java.sql.*;
public class ConnectionManager{
    public static Connection getConnection(){try{Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");return con;}catch(Exception e){}return null;}}
