package Clase_12;

public class Generic {
    public static void main(String[] args) {
        // Instancio las clases genericas
        Caja <String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola Generico");
        System.out.println(cajaDeTexto.obtener());
        
        Caja <Integer> cajaDeInteger = new Caja<>();
        cajaDeInteger.guardar(123);
        System.out.println(cajaDeInteger.obtener());
        
        
        //Utilizo el metodo de arrays
        String [] palabras =  {"Hola", "Chau"};
        Integer [] numeros =  {1, 2};
        
        Caja.imprimirArray(palabras);
        Caja.imprimirArray(numeros);
    }
}
