/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Toshiba2023
 */
public class Especialidad {
    int ID_Especialidad;
    String Nombre;
    
    

    public Especialidad(int ID_Especialidad, String Nombre) {
        this.ID_Especialidad = ID_Especialidad;
        this.Nombre = Nombre;
    }
    
    
    

    public Especialidad(String Nombre) {
        this.Nombre = Nombre;
    }

    public Especialidad() {
        
    }

    public int getId_Especialidad() {
        return ID_Especialidad;
    }

    public void setId_Especialidad(int Id_Especialidad) {
        this.ID_Especialidad = Id_Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString() {
        return ID_Especialidad + " - " + Nombre;
    }
    
}
