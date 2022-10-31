public class ProgramaAcademico {
    String codigo, nombre, acreditado;
    int cantidadCreditos, cantidadAdmitidos, cantidadDeSemestres;
    double valorMatricula;

    public ProgramaAcademico () {}

    public ProgramaAcademico (String codigo, String nombre, String acreditado, int cantidadCreditos, double valorMatricula, int cantidadAdmitidos, int cantidadDeSemestres){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
        this.valorMatricula = valorMatricula;
        this.cantidadAdmitidos = cantidadAdmitidos;
        this.cantidadDeSemestres = cantidadDeSemestres;
        this.acreditado = acreditado;
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

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public int getCantidadAmitidos() {
        return cantidadAdmitidos;
    }

    public void setCantidadAmitidos(int cantidadAmitidos) {
        this.cantidadAdmitidos = cantidadAmitidos;
    }

    public int getCantidadDeSemestres() {
        return cantidadDeSemestres;
    }

    public void setCantidadDeSemestres(int cantidadDeSemestres) {
        this.cantidadDeSemestres = cantidadDeSemestres;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public String isAcreditado() {
        return acreditado;
    }

    public void setAcreditado(String acreditado) {
        this.acreditado = acreditado;
    }
}