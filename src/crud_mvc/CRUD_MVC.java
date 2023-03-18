
package crud_mvc;

import Controlador.ControladorPersona;
import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.VistaPersona;

public class CRUD_MVC {

    public static void main(String[] args) {
        VistaPersona vista = new VistaPersona();
        Persona persona = new Persona();
        ConsultasPersona modelo = new ConsultasPersona();
        ControladorPersona controlador = new ControladorPersona(vista, persona, modelo);
        
        controlador.iniciar();
        vista.setVisible(true); 
        
    }
    
}
