
package modelo;

import java.sql.Date;


/**
 *
 * @author UNAN-Chontales
 */
public class Paciente {
  int Id_Cliente;
  int Id_Persona;
  Date Fecha_Nacimiento;
  String Cedula;
  String Procedencia; 

    public Paciente(int Id_Cliente, int Id_Persona, Date Fecha_Nacimiento, String Cedula, String Procedencia) {
        this.Id_Cliente = Id_Cliente;
        this.Id_Persona = Id_Persona;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Cedula = Cedula;
        this.Procedencia = Procedencia;
    }

    public Paciente(int Id_Persona, Date Fecha_Nacimiento, String Cedula, String Procedencia) {
        this.Id_Persona = Id_Persona;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Cedula = Cedula;
        this.Procedencia = Procedencia;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int Id_Persona) {
        this.Id_Persona = Id_Persona;
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

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }
    
    
}
