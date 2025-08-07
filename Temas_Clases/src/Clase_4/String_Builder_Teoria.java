package Clase_4;

public class String_Builder_Teoria {
    public static void main(String[] args) {
        //APPEND
        StringBuilder sb = new StringBuilder("Hola");
        
        sb.append(" mundo");
        System.out.println(sb);     //Hola mundo
        
        //INSERT
        StringBuilder sb2 = new StringBuilder("Hola mundo");
        
        sb2.insert(5, "bonito ");
        System.out.println(sb2);     //Hola bonito mundo, en el quinto lugar agrego bonito
        
        //REPLACE
        StringBuilder sb3 = new StringBuilder("Hola mundo");
        
        sb3.replace(5, 10,  "java");
        System.out.println(sb3);     //Hola java, del quinto al decimo lugar remplaca todo por java
        
        //DELETE
        StringBuilder sb4 = new StringBuilder("Hola mundo");
        
        sb4.delete(4, 10);
        System.out.println(sb4);     //Hola, del quinto al decimo lugar elimina lo que haya
        
        //toString
        StringBuilder sb5 = new StringBuilder("Hola mundo");
        String texto = sb5.toString();
        
        //LOS FOR SON MAS EFICIENTES CON STRINGBUILDER
        StringBuilder texto2 = new StringBuilder();
        for(int i = 0; i < 5; i++){
            texto2.append(i).append(" ");
            System.out.println("Interacion " + i + ": " + texto2.toString());
        }
    }
}
