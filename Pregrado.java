public class Pregrado extends ProgramaAcademico {
    String codigo, nombre, acreditado, tipoTrabajo;
    int cantidadCreditos, cantidadAdmitidos, cantidadDeSemestres;
    double valorMatricula;

    public Pregrado (){}

    public Pregrado (String codigo, String nombre, String acreditado, int cantidadCreditos, double valorMatricula, int cantidadAdmitidos, int cantidadDeSemestres, String tipoTrabajo){
        super(codigo, nombre, acreditado, cantidadCreditos, valorMatricula, cantidadAdmitidos, cantidadDeSemestres);
        this.tipoTrabajo = tipoTrabajo;
    }

}