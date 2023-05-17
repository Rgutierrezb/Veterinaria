/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Logic.Persona;
import Persistance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RGutierrezB
 */
public class PersistanceController {
    PersonaJpaController personaJPA = new PersonaJpaController();
    
    public void createPersona(Persona persona){
        try {
            personaJPA.create(persona);
        } catch (Exception ex) {
            Logger.getLogger(PersistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePersona(int rut) {
        try {
            personaJPA.destroy(rut);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePersona(Persona persona) {
        try {
            personaJPA.edit(persona);
        } catch (Exception ex) {
            Logger.getLogger(PersistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> personasAll() {
        return personaJPA.findPersonaEntities();
    }

    public Persona getPersonabyID(int id) {
        return personaJPA.findPersona(id);
    }
    
}
