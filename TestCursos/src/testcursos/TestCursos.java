package testcursos;
import Entidades.*;

public class TestCursos {

    public static void main(String[] args) {
       Alumno a1 = new Alumno("Santino", "Casado", 20);
       Alumno a2 = new Alumno("Facundo", "Casado", 50);
       
       Curso c1 = new Curso(NombreCurso.PROGRAMACION, 6);
       Curso c2 = new Curso(NombreCurso.MATEMATICA, 6);
       
       c1.setAlumno(a1);
       c2.setAlumno(a2);
       
       System.out.println(c1.MostrarInfo());
       System.out.println();
       System.out.println(c2.MostrarInfo());
    }
    
}
