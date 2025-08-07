package Entidades;


public enum NombreCurso {
    ARTE(1),
    MATEMATICA(2),
    LITERATURA(3),
    PROGRAMACION(4);
    
    private int index;
    
    private NombreCurso(int entero){
        this.index = entero;
    }

    public int getIndex() {
        return this.index;
    }
    
    
}

