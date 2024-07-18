import java.util.Scanner;

public class Nomina{
    private int id;
    private String Nombre;
    private double Salario;
    private String FechaDeIngreso;
    private String Puesto;
    private String CorreoElectronico;
    private String Telefono;
    private String Direccion;
    private String NivelAcademico;
    private String TipoDeSangre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        FechaDeIngreso = fechaDeIngreso;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNivelAcademico() {
        return NivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        NivelAcademico = nivelAcademico;
    }

    public String getTipoDeSangre() {
        return TipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        TipoDeSangre = tipoDeSangre;
    }
}
