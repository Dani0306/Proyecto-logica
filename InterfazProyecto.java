import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InterfazProyecto extends JFrame {

    static ArrayList<Institucion> instituciones = new ArrayList<Institucion>();

    JTextField PrCodigo, PrNombre, PrAcreditado, PrCantidadCreditos, PrValorMatricula, PrCantidadAdmitidos, PrCantidadSemestres, PrTipoTrabajo, PrNivel;
    JTextField Insnit, Insnombre, InsA├▒osExistencia;
    JTextField FaDecano, FaNombre, FaCodigo;

    JComboBox SeleccionarFacultadParaPorcentajeDePosgrado;
    JComboBox SeleccionarInstitucionParaRegistrarFacultad;
    JComboBox SeleccionarInstitucionParaA├▒adirProgramaAFacultad, SeleccionarFacultadParaA├▒adirPrograma;
    JComboBox SeleccionarInstitucionParaContarProgramasAcademicos;


    String institucionSelecionada;
    String FacultadSeleccionadaParaElPorcentaje; 
    String institucionSelecionadaParaModificarFacultad, FacultadSelecionadaParaModificarPrograma;
    String institucionSelecionadaParaContarProgramas;

    JRadioButton posgrado, pregrado;
    ButtonGroup tipoPrograma;

    int acumuladorDeProgramas = 0;
    int totalProgramasPorFacultad = 0, totalPosgradosPorFacultad = 0;
    double porcentajePosgradosEnFacultades;


    double promedioDeMatriculas, acumuladorPromedioMatriculas = 0;
    int contadorPromedioDeMatriculas = 0;

    double promedioDeAdmitidos, acumuladorPromedioAdmitidos = 0;
    int contadorPromedioDeAdmitidos = 0;
    

    public InterfazProyecto (){
        setLayout(new FlowLayout());




        setSize(950, 700);
        setVisible(true);
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    // MAIN
    public static void main(String args[]){
        Institucion testInstitucion = new Institucion("3434j3k", "IUE", 3);
        Facultad testFacultad = new Facultad("453jh4k3j", "Derecho", "Juan Luis");
        Pregrado testPregrado = new Pregrado("4395jhk", "ingenieria informatica", "si", 23, 3421223, 34, 9, "estudiante");
        Posgrado testPosgrado = new Posgrado("4395jhk", "ingenieria informatica", "si", 23, 3421223, 34, 9, "maestria");
        testInstitucion.facultades.add(testFacultad);
        testInstitucion.facultades.get(0).programas.add(testPregrado);
        testInstitucion.facultades.get(0).programas.add(testPosgrado);


        

    }


    // REGISTRAR UNA INSTITUCI├ôN

    class RegistrarInstitucion implements ActionListener {
        public void actionPerformed(ActionEvent e){
            new Institucion(Insnit.getText(), Insnombre.getText(), Integer.parseInt(InsA├▒osExistencia.getText()));
        }
    }


    // crear facultades en una institucion

    class CrearFacultades implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Facultad facultad = new Facultad(FaCodigo.getText(), FaNombre.getText(), FaDecano.getText());

            institucionSelecionada = SeleccionarInstitucionParaRegistrarFacultad.getSelectedItem().toString();

            for (int i = 0; i < instituciones.size(); i++){
                if(institucionSelecionada.equals(instituciones.get(i).nombre)){
                    instituciones.get(i).facultades.add(facultad);
                }
            }


        }
    }


    // registrar un programa academico 


    class RegistrarProgramaAcademico implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(tipoPrograma.isSelected(pregrado.getModel())){
                Pregrado nuevoPregrado = new Pregrado(PrCodigo.getText(), PrNombre.getText(), PrAcreditado.getText(), Integer.parseInt(PrCantidadCreditos.getText()), Double.parseDouble(PrValorMatricula.getText()), Integer.parseInt(PrCantidadAdmitidos.getText()), Integer.parseInt(PrCantidadSemestres.getText()), PrTipoTrabajo.getText());

            institucionSelecionadaParaModificarFacultad = SeleccionarInstitucionParaA├▒adirProgramaAFacultad.getSelectedItem().toString();
            FacultadSelecionadaParaModificarPrograma = SeleccionarFacultadParaA├▒adirPrograma.getSelectedItem().toString();

                for (int i = 0;i < instituciones.size(); i++){
                    if(institucionSelecionada.equals(instituciones.get(i).nombre)){
                        for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                            if(instituciones.get(i).facultades.get(j).nombre.equals(FacultadSelecionadaParaModificarPrograma)){
                                instituciones.get(i).facultades.get(j).programas.add(nuevoPregrado);
                            }
                        }
                    }
                }

            } else {
                Posgrado nuevoPosgrado = new Posgrado(PrCodigo.getText(), PrNombre.getText(), PrAcreditado.getText(), Integer.parseInt(PrCantidadCreditos.getText()), Double.parseDouble(PrValorMatricula.getText()), Integer.parseInt(PrCantidadAdmitidos.getText()), Integer.parseInt(PrCantidadSemestres.getText()), PrNivel.getText());

                institucionSelecionadaParaModificarFacultad = SeleccionarInstitucionParaA├▒adirProgramaAFacultad.getSelectedItem().toString();
                FacultadSelecionadaParaModificarPrograma = SeleccionarFacultadParaA├▒adirPrograma.getSelectedItem().toString();

                for (int i = 0;i < instituciones.size(); i++){
                    if(institucionSelecionada.equals(instituciones.get(i).nombre)){
                        for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                            if(instituciones.get(i).facultades.get(j).nombre.equals(FacultadSelecionadaParaModificarPrograma)){
                                instituciones.get(i).facultades.get(j).programas.add(nuevoPosgrado);
                            }
                        }
                    }
                }
            }
        }
    }


    // mostrar cantidad de programas academicos que tiene una institucion


    class CantidadDeProgramasEnUnaInstitucion implements ActionListener {
        public void actionPerformed(ActionEvent e){
            institucionSelecionadaParaContarProgramas = SeleccionarInstitucionParaContarProgramasAcademicos.getSelectedItem().toString();

            for (int i = 0; i < instituciones.size(); i++){
                if(instituciones.get(i).nombre.equals(institucionSelecionadaParaContarProgramas)){
                    for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                        acumuladorDeProgramas += instituciones.get(i).facultades.get(j).programas.size();
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "La cantidad de programas acad├ęmicos registrados en la institucion " + institucionSelecionadaParaContarProgramas + " es de " + acumuladorDeProgramas);
            

        }
    }

    // Mostrar el porcentaje de programas de posgrado que ofrece una facultad

    // int totalProgramasPorFacultad = 0, totalPosgradosPorFacultad = 0;


    class CalcularPorcentajeDePosgradoEnFacultad implements ActionListener {
        public void actionPerformed(ActionEvent e){
            FacultadSeleccionadaParaElPorcentaje = SeleccionarFacultadParaPorcentajeDePosgrado.getSelectedItem().toString();

            for (int i = 0; i < instituciones.size(); i++){
                for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                    if(instituciones.get(i).facultades.get(j).nombre.equals(FacultadSeleccionadaParaElPorcentaje)){
                        for (int c = 0; c < instituciones.get(i).facultades.get(j).programas.size(); c++){
                            if(instituciones.get(i).facultades.get(j).programas.get(c) instanceof Posgrado){
                                totalPosgradosPorFacultad++;
                            }
                            totalProgramasPorFacultad++;
                        }
                    }
                }
            }

            porcentajePosgradosEnFacultades = (totalPosgradosPorFacultad * 100) / totalProgramasPorFacultad;

            JOptionPane.showMessageDialog(null, "El porcentaje total de posgrados en la facultad de " + FacultadSeleccionadaParaElPorcentaje + " es de " + porcentajePosgradosEnFacultades + " %");

        }
    }


    // Mostrar el valor de matr├şcula promedio de todos los programas acad├ęmicos del municipio de Envigado  


    class CalcularMatriculaPromedio implements ActionListener {
        public void actionPerformed(ActionEvent e){
            FacultadSeleccionadaParaElPorcentaje = SeleccionarFacultadParaPorcentajeDePosgrado.getSelectedItem().toString();

            for (int i = 0; i < instituciones.size(); i++){
                for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                        for (int c = 0; c < instituciones.get(i).facultades.get(j).programas.size(); c++){
                            acumuladorDeProgramas += instituciones.get(i).facultades.get(j).programas.get(c).valorMatricula;
                            contadorPromedioDeMatriculas++;
                        }
                    }
                }

                promedioDeMatriculas = acumuladorPromedioMatriculas / contadorPromedioDeMatriculas;

            JOptionPane.showMessageDialog(null, "El valor promedio de la matricula de todos los programas acad├ęmicos del municipio de Envigado es de: " + promedioDeMatriculas);

        }
    }


    // 7.	Calcular el n├║mero total de admitidos, para un semestre,
    //  en los programas acad├ęmicos acreditados de una instituci├│n de educaci├│n superior espec├şfica. 


    class CalcularNumeroTotalDeAdmitidosPorSemestre implements ActionListener {
        public void actionPerformed(ActionEvent e){
            FacultadSeleccionadaParaElPorcentaje = SeleccionarFacultadParaPorcentajeDePosgrado.getSelectedItem().toString();


        // double promedioDeAdmitidos, acumuladorPromedioAdmitidos = 0;
        // int contadorPromedioDeAdmitidos = 0;
    

            for (int i = 0; i < instituciones.size(); i++){
                for (int j = 0; j < instituciones.get(i).facultades.size(); j++){
                        for (int c = 0; c < instituciones.get(i).facultades.get(j).programas.size(); c++){
                            acumuladorPromedioAdmitidos += instituciones.get(i).facultades.get(j).programas.get(c).cantidadAdmitidos;
                            contadorPromedioDeAdmitidos++;
                        }
                    }
                }

                promedioDeAdmitidos = acumuladorPromedioAdmitidos / contadorPromedioDeAdmitidos;

            JOptionPane.showMessageDialog(null, "El valor promedio de la matricula de todos los programas acad├ęmicos del municipio de Envigado es de: " + promedioDeMatriculas);

        }
    }




}