package quanlidulich;

import java.sql.*;
import java.io.Serializable;
public class Conn {//implements Serializable{
    Connection conn;
    Statement s;
    public  Conn(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = ("jdbc:sqlserver://localhost:1433;databaseName= quanlidulich_final;");
            conn = DriverManager.getConnection(url, "sa", "123");
            s = conn.createStatement();
            //return conn;
        } catch (Exception e) {
            //e.printStackTrace();
        }
        //return null;
    }
//    public static void main (String[] args){
//        Conn c =new Conn();
//     System.out.println("Connect");
//    }
}

