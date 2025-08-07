package Entidades;

public class Curso {
    private NombreCurso nombreCurso;
    private int cantidadHoras;
    private Alumno alumno;
    
    public String MostrarInfo()
    {
        return "Cuso: "+this.nombreCurso +"\n"+"Carga Horaria: "+this.cantidadHoras +"\n"+ "Alumno: "+alumno.getNombreCompleto()+ "\n"+"Edad: "+alumno.getEdad();
    }

    public Curso() {
        this.nombreCurso = NombreCurso.PROGRAMACION;
        this.cantidadHoras = 0;
        this.alumno = null;
    }
    
    public Curso(NombreCurso nombreCurso){
        this();
        this.nombreCurso = nombreCurso;
    }
    
    public Curso(NombreCurso nombreCurso, int cantidadHoras){
        this(nombreCurso); 
        this.cantidadHoras = cantidadHoras;
    }
    
    public Curso(NombreCurso nombreCurso, int cantidadHoras, Alumno alumno){
        this(nombreCurso, cantidadHoras);
        this.alumno = alumno;
    }
    
    public void setAlumno(Alumno alumno)
    {
        if(this.validadEdad(alumno.getEdad()))
        {
            this.alumno = alumno;
        }else{
            System.out.println("No se pudo setear el alumno!");
        }
    }
    
    private boolean validadEdad(int edad)
    {
        return edad >= 18;
    }
    
    public String mostrarInfo()
    {
        String mensaje = this.nombreCurso + "\n" + this.cantidadHoras + "\n";
        if (this.alumno != null){
        mensaje += this.alumno.getNombreCompleto() + "\n" + this.alumno.getEdad();
        }else{
            mensaje = "No se pudo ingresar alumno";
        }
        return mensaje;
    }
}
