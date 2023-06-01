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
    private int ID_Cliente;
    private int ID_Doctor;
    private Date Fecha;
    private Time Hora;

    public CitasMedicas(int ID_Cliente, int ID_Doctor, Date Fecha, Time Hora) {
        this.ID_Cliente = ID_Cliente;
        this.ID_Doctor = ID_Doctor;
        this.Fecha = Fecha;
        this.Hora = Hora;
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
