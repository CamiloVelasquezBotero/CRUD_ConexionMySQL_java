
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL = "jdbc:mysql://127.0.0.1:3307/escuela?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "Camilo123";
    
    public Connection getConnection(){  //Metodo para obtener la conexion entre Java y MySQL
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL, usuario, contraseña);
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        return conexion;
    } 
}
