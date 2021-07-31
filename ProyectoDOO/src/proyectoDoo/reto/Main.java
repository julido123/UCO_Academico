package proyectoDoo.reto;

import proyectoDoo.dominio.Estudiante;
import proyectoDoo.dominio.Materia;
import proyectoDoo.dominio.Matricula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Materia> listaMaterias=new ArrayList<>();
        Estudiante julian=new Estudiante("Julián","Vásquez","Ingenieria de Sistemas",1007689081);

        Materia algebra=new Materia(0126,"Álgebra",8,4,"Lunes");
        Materia geoTrigo=new Materia(0136,"GEOMETRIA Y TRIGONOMETRIA",6,4,"Martes");
        Materia logica=new Materia(0146,"LOGICA CONJUNTOS Y FUNCIONES",10,4,"Lunes");
        Materia proyectoHumano=new Materia(0116,"PROYECTO HUMANO Y PROFESIONAL",18,1,"Miercoles");
        Materia razonamientoLogico=new Materia(0166,"RAZONAMIENTO LOGICO Y ABSTRACTO",16,4,"Jueves");

        Matricula matricula=new Matricula(julian,listaMaterias,15,1);

        listaMaterias.add(algebra);
        listaMaterias.add(geoTrigo);
        listaMaterias.add(logica);
        //listaMaterias.add(razonamientoLogico);

        matricula.crearMatricula(matricula);



        //List<Materia> listaMaterias=  Arrays.asList(algebra,geoTrigo,logica,proyectoHumano);





    }
}
