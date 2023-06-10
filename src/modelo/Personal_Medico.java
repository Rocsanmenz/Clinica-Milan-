
package modelo;

/**
 *
 * @author Toshiba2023
 */
public class Personal_Medico {
    int Id_Doctor;
    int Id_Persona;
    int ID_Especialidad;
    int Codigo_Minsa;
    String Procedencia_Medica;
    String Usuario;
    String Contrasena;

    public Personal_Medico(int Id_Doctor, int Id_Persona, int ID_Especialidad, int Codigo_Minsa, String Procedencia_Medica, String Usuario, String Contrasena) {
        this.Id_Doctor = Id_Doctor;
        this.Id_Persona = Id_Persona;
        this.ID_Especialidad = ID_Especialidad;
        this.Codigo_Minsa = Codigo_Minsa;
        this.Procedencia_Medica = Procedencia_Medica;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public Personal_Medico(int Id_Persona, int ID_Especialidad, int Codigo_Minsa, String Procedencia_Medica, String Usuario, String Contrasena) {
        this.Id_Persona = Id_Persona;
        this.ID_Especialidad = ID_Especialidad;
        this.Codigo_Minsa = Codigo_Minsa;
        this.Procedencia_Medica = Procedencia_Medica;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public int getId_Doctor() {
        return Id_Doctor;
    }

    public void setId_Doctor(int Id_Doctor) {
        this.Id_Doctor = Id_Doctor;
    }

    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public int getID_Especialidad() {
        return ID_Especialidad;
    }

    public void setID_Especialidad(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

    public int getCodigo_Minsa() {
        return Codigo_Minsa;
    }

    public void setCodigo_Minsa(int Codigo_Minsa) {
        this.Codigo_Minsa = Codigo_Minsa;
    }

    public String getProcedencia_Medica() {
        return Procedencia_Medica;
    }

    public void setProcedencia_Medica(String Procedencia_Medica) {
        this.Procedencia_Medica = Procedencia_Medica;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
} 
