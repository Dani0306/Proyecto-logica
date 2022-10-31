public class Posgrado extends ProgramaAcademico {
    String codigo, nombre, acreditado, nivel;
    int cantidadCreditos, cantidadAdmitidos, cantidadDeSemestres;
    double valorMatricula;

    public Posgrado(){}

    public Posgrado (String codigo, String nombre, String acreditado, int cantidadCreditos, double valorMatricula, int cantidadAdmitidos, int cantidadDeSemestres, String nivel){
        super(codigo, nombre, acreditado, cantidadCreditos, valorMatricula, cantidadAdmitidos, cantidadDeSemestres);
        this.nivel = nivel;
    }

}