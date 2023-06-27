
package modelo;

import java.sql.Date;

/**
 *
 * @author FAREM CH-12
 */
public class Servicios {
    int ID_Servicio;
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

    public Servicios(int ID_Servicio, String Nombre_Servicio, Date Fecha, float Precio, int ID_Categoria) {
        this.ID_Servicio = ID_Servicio;
        this.Nombre_Servicio = Nombre_Servicio;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.ID_Categoria = ID_Categoria;
    }
    
    

    public int getID_Servicio() {
        return ID_Servicio;
    }

    public void setID_Servicio(int ID_Servicio) {
        this.ID_Servicio = ID_Servicio;
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
