/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author gonzalez
 */
public class CitasMedicas {
     int ID_CLIMED;
     int ID_Cliente;
     int ID_Doctor;
     Date Fecha;
     Time Hora;

    public CitasMedicas(int ID_CLIMED, int ID_Cliente, int ID_Doctor, Date Fecha, Time Hora) {
        this.ID_CLIMED = ID_CLIMED;
        this.ID_Cliente = ID_Cliente;
        this.ID_Doctor = ID_Doctor;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public CitasMedicas(int ID_Cliente, int ID_Doctor, Date Fecha, Time Hora) {
        this.ID_Cliente = ID_Cliente;
        this.ID_Doctor = ID_Doctor;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public int getID_CLIMED() {
        return ID_CLIMED;
    }

    public void setID_CLIMED(int ID_CLIMED) {
        this.ID_CLIMED = ID_CLIMED;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Doctor() {
        return ID_Doctor;
    }

    public void setID_Doctor(int ID_Doctor) {
        this.ID_Doctor = ID_Doctor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

   
}
