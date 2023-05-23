
package modelo;

import java.sql.Date;


/**
 *
 * @author UNAN-Chontales
 */
public class Paciente {
    String Nombres;
    String Apellidos;
    Date Fecha_Nacimiento;
    String Cedula;
    String Direccion;
    char Sexo;
    String Correo;
    int Telefono;
    String Procedencia; 

    public Paciente(String Nombres, String Apellidos, Date Fecha_Nacimiento, String Cedula, String Direccion, char Sexo, String Correo, int Telefono, String Procedencia) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Sexo = Sexo;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Procedencia = Procedencia;
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

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }
    
    
}
