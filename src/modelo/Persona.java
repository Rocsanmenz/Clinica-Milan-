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
public class Persona {
    int Id_Persona;
    String Nombres;
    String Apellidos;
    char Sexo;
    String Correo;
    String Telefono;

    public Persona(int Id_Persona, String Nombres, String Apellidos, char Sexo, String Correo, String Telefono) {
        this.Id_Persona = Id_Persona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Persona(String Nombres, String Apellidos, char Sexo, String Correo, String Telefono) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Persona(String Nombres, String Apellidos,  String Telefono) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
    }

    public Persona(int Id_Persona, String Nombres, String Apellidos, String Telefono) {
        this.Id_Persona = Id_Persona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
    }

    public Persona(String Nombres, String Apellidos, String Correo, String Telefono) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Persona(int Id_Persona, String Nombres, String Apellidos, String Correo, String Telefono) {
        this.Id_Persona = Id_Persona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    
    

    
    
    
    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
