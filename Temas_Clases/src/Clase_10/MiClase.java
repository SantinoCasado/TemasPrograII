package Clase_10;




public class MiClase implements MiInterface {           //Lo junto con la interface
    int valor;

    public MiClase(int valor) {
        this.valor = MiInterface.CONSTANTE;                 //Le asigno el valor de la interface a un atributo de la clase
    }
    
    @Override
    public void metodo(){
        System.out.println("Doy Implementacion Por Obligacion");            //Le doy implentacion al metodo de la interface que estab en stand by
    }
    
    @Override
    public void metodoPorDefecto(){                                                     //Llamo al metodo y modifico agrgandole un print
        MiInterface.super.metodoPorDefecto();
        System.out.println("Modifico parcialmente el metodo");
    }
    
    public void otroMetodo(){
        MiInterface.metodoEstatico();                                                       //Creo un nuevo metodo el cual llama al metodo de la interface
    }

}
