
package modelo;

/**
 *
 * @author FAREM CH-12
 */
public class Categoria {
    int Id_Categoria;
    String Nombre_Categoria;
    
     public Categoria() {
    }
    

    public Categoria(int Id_Categoria, String Nombre_Categoria) {
        this.Id_Categoria = Id_Categoria;
        this.Nombre_Categoria = Nombre_Categoria;
    }

   
    public Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public int getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(int Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

     

}
    

