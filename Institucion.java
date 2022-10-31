import java.util.ArrayList;

public class Institucion {
    String nit, nombre;
    int cantidadFacultades, jtAñosExistencia;
    ArrayList<Facultad> facultades;


    public Institucion(){}

    public Institucion(String nit, String nombre, int  jtAñosExistencia){
        this.nit = nit;
        this.nombre = nombre;
        this.facultades = new ArrayList<Facultad>();
        this.cantidadFacultades = this.facultades.size();
        this.jtAñosExistencia = jtAñosExistencia;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }

    public int getCantidadFacultades() {
        return cantidadFacultades;
    }

    public void setCantidadFacultades(int cantidadFacultades) {
        this.cantidadFacultades = cantidadFacultades;
    }

    public int getAñosExperiencia() {
        return jtAñosExistencia;
    }

    public void setAñosExperiencia(int jtAñosExistencia) {
        this.jtAñosExistencia = jtAñosExistencia;
    }

    public String toString (){
        return "";
    }


}