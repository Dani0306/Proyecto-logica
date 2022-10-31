import java.util.ArrayList;

public class Facultad {
    String codigo, nombre, decano;
    int cantidadProgramas;
    ArrayList<ProgramaAcademico> programas;

    public Facultad(){}

    public Facultad(String codigo, String nombre, String decano){
        this.codigo = codigo;
        this.nombre = nombre;
        this.decano = decano;
        this.programas = new ArrayList<ProgramaAcademico>();
        this.cantidadProgramas = this.programas.size();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }

    public ArrayList<ProgramaAcademico> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<ProgramaAcademico> programas) {
        this.programas = programas;
    }

    public int getCantidadProgramas() {
        return cantidadProgramas;
    }

    public void setCantidadProgramas(int cantidadProgramas) {
        this.cantidadProgramas = cantidadProgramas;
    }

    public String toString (){
        return "";
    }


}