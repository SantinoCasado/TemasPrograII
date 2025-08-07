package Clase_4;


public class Test_Sobrecarga {
    public static void main(String[] args) {
        Sobrecarga p1 = new Sobrecarga("Facundo", "Secundario", 200);
        
        System.out.println(p1.nombre);
        System.out.println(p1.nivelEstudio);
        System.out.println(p1.edad);
        
        Sobrecarga p2 = new Sobrecarga("Juan");
        
        System.out.println(p2.nombre);
        System.out.println(p2.nivelEstudio);
        System.out.println(p2.edad);
        
        Sobrecarga p3 = new Sobrecarga("Juan", "Primario");
        
        System.out.println(p3.nombre);
        System.out.println(p3.nivelEstudio);
        System.out.println(p3.edad);
        
        Sobrecarga p4 = new Sobrecarga("", "", 18);
        
        System.out.println(p4.nombre);
        System.out.println(p4.nivelEstudio);
        System.out.println(p4.edad);
    }
}
