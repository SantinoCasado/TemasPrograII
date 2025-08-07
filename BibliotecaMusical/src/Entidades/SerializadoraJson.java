
package Entidades;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class SerializadoraJson {
    private static Gson gson;
    
    static{
    gson = new Gson();
    }
    
    public static <T> void guardar(ArrayList<T> lista, String path ){
    
     try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            
            gson.toJson(lista,writer);       
            
        } catch (IOException e) {
            
            System.out.println("Ocurrio un error al serializar JSON: " + e.getMessage());
            System.out.println("");
        }     
    }
    
    
    public static <T> ArrayList<T> leer(String path, Class<T> clase){
         try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
                Type obj = TypeToken.getParameterized(List.class,clase).getType();
                return gson.fromJson(br,obj);
                
           
        } catch (Exception e) {
            System.out.println("Ocurrio un error al deserializar JSON: " + e.getMessage());
            System.out.println("");
        }
     return null;    
    }
    
    
}
