/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logic;

import Persistance.PersistanceController;
import java.util.Date;
import java.util.List;

/**
 *
 * @author RGutierrezB
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // EJEMPLO DE CRUD PARA LA ENTIDAD PERSONA

        Persona persona = new Persona(12345677, "Andres", "Jimenez", "Suarez", new Date("06/29/1986"));
        Persona persona2 = new Persona(12345678, "Juanito", "Perez", "Valenzuela", new Date("08/22/1975"));
        PersistanceController controller = new PersistanceController();
        
        //create
        //controller.createPersona(persona);
        //controller.createPersona(persona2);
        
        //read
        /*System.out.println("==================================================");
        System.out.println("Listado de personas en el sistema veterinaria:");
        System.out.println("");
        
        List<Persona> personas = controller.personasAll();
        for (Persona p : personas) {
            System.out.println(p);
        }
        System.out.println("==================================================");*/
        
        System.out.println("==================================================");
        System.out.println("Datos de una persona en el sistema veterinaria:");
        System.out.println("");
        Persona persona3 = controller.getPersonabyID(12345677);
        System.out.println(persona3.toString());
        
        System.out.println("==================================================");
        
        //update
        //persona2.setNombre("Paola");
        //controller.updatePersona(persona2);
        
        //delete
        //controller.deletePersona(persona2.getRut());
    }
    
}
