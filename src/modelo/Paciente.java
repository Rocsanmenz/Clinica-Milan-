package modelo;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Oreki
 */
public class Paciente extends Persona {

    int Id_Cliente;
    String Cedula;
    String Procedencia;
    String Edad;
    String Medico;
    String procedimiento;

    public Paciente(int Id_Cliente,  String Cedula, String Procedencia, String Edad, String Medico, String procedimiento, int Id_Persona, String Nombres, String Apellidos, char Sexo, String Correo, String Telefono) {
        super(Id_Persona, Nombres, Apellidos, Sexo, Correo, Telefono);
        this.Id_Cliente = Id_Cliente;
        
        this.Cedula = Cedula;
        this.Procedencia = Procedencia;
        this.Edad = Edad;
        this.Medico = Medico;
        this.procedimiento = procedimiento;
    }

    public Paciente( String Cedula, String Procedencia, String Edad, String Medico, String procedimiento, String Nombres, String Apellidos, String Telefono)  {
        super(Nombres, Apellidos,  Telefono);
        
        this.Cedula = Cedula;
        this.Procedencia = Procedencia;
        this.Edad = Edad;
        this.Medico = Medico;
        this.procedimiento = procedimiento;
    }

    public Paciente( String Cedula, String Procedencia, String Edad, String Medico, String procedimiento, int Id_Persona, String Nombres, String Apellidos, String Telefono) {
        super(Id_Persona, Nombres, Apellidos, Telefono);
        
        this.Cedula = Cedula;
        this.Procedencia = Procedencia;
        this.Edad = Edad;
        this.Medico = Medico;
        this.procedimiento = procedimiento;
    }
    
    

    

    
    
//    public Paciente(Date Fecha_Nacimiento, String Cedula, String Procedencia, String Direccion, String Nombres, String Apellidos, String Correo, String Telefono) {
//        super(Nombres, Apellidos, Correo, Telefono);
//
//        this.Fecha_Nacimiento = Fecha_Nacimiento;
//
//        this.Cedula = Cedula;
//        this.Procedencia = Procedencia;
//        this.Direccion = Direccion;
//    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
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

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    

}
