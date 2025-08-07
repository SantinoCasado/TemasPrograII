package Clase_10;


public interface MiInterface {
    int CONSTANTE = 5;
    
    void metodo();
    
    default void  metodoPorDefecto(){
        System.out.println("Tiene implementacion");
    }
    
    static void metodoEstatico(){
        System.out.println("Metodo Estatico");
    }
}

