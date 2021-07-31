package proyectoDoo.dominio;

import java.util.List;

public class Matricula {
    private Estudiante estudiante;
    private List<Materia> materias;
    private int NUMEROMAXIMOCREDITOS;
    private int periodoAcademico;

    public Matricula(Estudiante estudiante, List<Materia> materias, int NUMEROMAXIMOCREDITOS, int periodoAcademico) {
        this.estudiante = estudiante;
        this.materias = materias;
        this.NUMEROMAXIMOCREDITOS = NUMEROMAXIMOCREDITOS;
        this.periodoAcademico = periodoAcademico;
    }

    public void comprobarCruce(Matricula matricula){

        for (Materia materia:this.materias) {
           /* if (matricula.getMaterias().){

            }*/
        }
    }

    public void crearMatricula(Matricula matricula){
        int suma=0;
        for (Materia materia:this.materias) {
            suma=materia.getCreditos()+suma;
        }
        if (suma>matricula.getNUMEROMAXIMOCREDITOS()){
            System.out.println("Los creditos superan los creditos maximos permitidos");

        }else {
            System.out.println("Su matricula fue completada con exito");
        }

    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNUMEROMAXIMOCREDITOS() {
        return NUMEROMAXIMOCREDITOS;
    }

    public void setNUMEROMAXIMOCREDITOS(int NUMEROMAXIMOCREDITOS) {
        this.NUMEROMAXIMOCREDITOS = NUMEROMAXIMOCREDITOS;
    }

    public int getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(int periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }
}
