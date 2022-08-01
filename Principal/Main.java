package Principal;
import Vistas.*;
import Modelo.*;
public class Main {

    public static void main(String[] args) {
    //1. Creamos la instancia de la vista Login
    Login login = new Login();
    //2.El metodo setVisible hace visible la ventana
    login.setVisible(true);
    
    //3. Crear una instancia de la clase conexion
    Conexion conexion = new Conexion();
    conexion.getConnection();
    
    }
    
}
