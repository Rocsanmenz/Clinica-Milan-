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
    int Id_Especialidad;
    String Nombre;
    
    

    public Especialidad(int Id_Especialidad, String Nombre) {
        this.Id_Especialidad = Id_Especialidad;
        this.Nombre = Nombre;
    }
    
    
    

    public Especialidad(String Nombre) {
        this.Nombre = Nombre;
    }

    public Especialidad() {
        
    }

    public int getId_Especialidad() {
        return Id_Especialidad;
    }

    public void setId_Especialidad(int Id_Especialidad) {
        this.Id_Especialidad = Id_Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString() {
        return Id_Especialidad + " - " + Nombre;
    }
    
}
