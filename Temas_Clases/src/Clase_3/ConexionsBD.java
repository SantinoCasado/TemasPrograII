
package Clase_3;


public class ConexionsBD {
    private static ConexionsBD instancia;              //Por clase solo tengo una instancia
    private String configuracionConexion;
    static int cantidadConexiones;
    
    static{                         ///Bloque de codigo que establece valores a los atributos estaticos
    
        cantidadConexiones=0;
    }
    
    
    private ConexionsBD(){
        
        System.out.println("Conexion creada");
        this.configuracionConexion="Configurado";
        
    }
    
    public static ConexionsBD getInstancia(){
        if(instancia==null){        //Si no esta instanciado
            instancia = new ConexionsBD();  //Se instancia
        }
        
        return instancia;       //Si ya esta instanciada la devuelve
    }
    
    public void conectar(){
        System.out.println("Conectado a la BD");
    }
}
