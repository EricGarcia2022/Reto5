package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    //1. crear instancia de la clase Connection
    Connection connection;
    // Atributos
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto3_g53";
    String usuario = "root";
    String contraseña = "";
    
    
    //2. Añadir constructor sin args de la clase

    public Conexion() {
       //3.Intentar conectar co la base de datos 
       try{
           Class.forName(driver);
           connection = DriverManager.getConnection(cadenaConexion,usuario,contraseña);
           //4.Verificamos si la conexion devuelve algo
           if (connection != null){
               System.out.println("Conexion exitosa con la base de datos");
            }
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("No se pudo establecer conexion con la base de datos");
       }
       
    }
    
    //5. Crear funcion que retorna la clase connection
    public Connection getConnection(){
        return connection;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
