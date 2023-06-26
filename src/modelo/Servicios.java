
package modelo;

import java.sql.Date;

/**
 *
 * @author FAREM CH-12
 */
public class Servicios {
    int Id_Servicio;
    String Nombre_Servicio;
    Date Fecha;
    float Precio;
    int ID_Categoria;

    public Servicios(String Nombre_Servicio, Date Fecha, float Precio, int ID_Categoria) {
        this.Nombre_Servicio = Nombre_Servicio;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.ID_Categoria = ID_Categoria;
    }

    public Servicios(int Id_Servicio, String Nombre_Servicio, Date Fecha, float Precio, int ID_Categoria) {
        this.Id_Servicio = Id_Servicio;
        this.Nombre_Servicio = Nombre_Servicio;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.ID_Categoria = ID_Categoria;
    }
    
    

    public int getId_Servicio() {
        return Id_Servicio;
    }

    public void setId_Servicio(int Id_Servicio) {
        this.Id_Servicio = Id_Servicio;
    }

    public String getNombre_Servicio() {
        return Nombre_Servicio;
    }

    public void setNombre_Servicio(String Nombre_Servicio) {
        this.Nombre_Servicio = Nombre_Servicio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }
    
   
}
