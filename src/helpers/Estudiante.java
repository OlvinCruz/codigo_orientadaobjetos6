/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Olvin
 */
public class Estudiante extends Persona {
    
    public Estudiante (){
        setNombre("Olvin Cruz ");
        setSexo("Masculino ");
        setEdad("34 años ");   
    }

    @Override
    public String getInformacionPersona() {
        return "Estudiante ";
        }
    
}
