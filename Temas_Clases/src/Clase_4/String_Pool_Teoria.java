package Clase_4;

public class String_Pool_Teoria {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String cadena2 = "HOLA";
        String cadena4 = "Mundo";
        
        String cadena3 = new String("hola");
        
        
        boolean mismaReferencia = cadena == cadena2;    //True
        boolean mismaReferencia2 = cadena == cadena3;   //False, cadena 3 es un nuevo string mientras que cadena 2 se reutiliza de cadena1
        
        boolean mismoValor = cadena.equals(cadena3);     //True
        
        
        System.out.println(cadena.length());            //10
        System.out.println(cadena.substring(0, 2));     //"Ho"
        System.out.println(cadena4.toUpperCase());      //"MUNDO"
        System.out.println(cadena2.toLowerCase());      //"hola"
        System.out.println(cadena.contains(cadena4));   //True
        System.out.println(cadena4.indexOf("o"));       //Posicion 4, Donde se encuentra dentro de la variavle esa letra
        System.out.println(cadena.replace("o", "a"));   //Hala Munda
    }
}
