/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author UNAN-Chontales
 */
public class Paciente {
    int Id_Paciente;
    String Nombres;
    String Apellidos;
    String Procedencia;
    int Telefono;
    String Correo;//Revisar si es string
    String Direccion;
    String Cedula;

    public Paciente(int Id_Paciente, String Nombres, String Apellidos, String Procedencia, int Telefono, String Correo, String Direccion, String Cedula) {
        this.Id_Paciente = Id_Paciente;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Procedencia = Procedencia;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
    }

    public int getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(int Id_Paciente) {
        this.Id_Paciente = Id_Paciente;
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

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    
}
