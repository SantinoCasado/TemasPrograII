
package Entidades;

import java.util.Objects;

/**
Pintura (deriva de ObraArte, implementa IVendible):
Posee un único atributo tecnica: TecnicaPintura, que será inicializado por su único constructor.
 Métodos:
●getValorComercial(): método público y de instancia, que retorna un valor de tipo double,
representando el valor comercial estimado de la obra. Este valor será calculado a partir del valor base
de la obra, incrementado según la técnica, de acuerdo a las siguientes reglas:
● Si la técnica es OLEO, se retorna el valor más un 30% adicional.
● Si la técnica es ACRILICO, se retorna el valor más un 20% adicional.
● Si la técnica es ACUARELA, se retorna el valor más un 10% adicional.
Sobrescritura del método toString(). Retornará una cadena de caracteres conteniendo la información
completa de la pintura incluyendo su valor comercial.
Sobrescritura del método equals(), que retorna true, si el parámetro recibido es igual a la instancia
actual (ambas obras son iguales) y las técnicas son iguales, false, caso contrario.
 */
public class Pintura extends ObraArte implements IVendible {
    private TecnicaPintura tecnica;

//    public Pintura( Artista artista, String titulo, Double valor,TecnicaPintura tecnica) {
//        super(artista, titulo, valor);
//        this.tecnica = tecnica;
//    }  esta bien esto ?
    
    public Pintura( String titulo, double valor, String nombre, String apellido,TecnicaPintura tecnica) {
        super(titulo, valor, nombre, apellido);
        this.tecnica = tecnica;
    }

   
    @Override
    public double getValorComercial() {
      if(this.tecnica == TecnicaPintura.ACRILICO) {
      this.valor = this.valor*1.2;
      }else if (this.tecnica == TecnicaPintura.OLEO){
          this.valor = this.valor*1.3;
      }else if (this.tecnica == TecnicaPintura.ACRILICO){
      this.valor = this.valor*1.1;
      }
        
    return this.valor; 
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(super.toString()).append("tecnica: ").append(this.tecnica).append("\n");
       sb.append("valor").append(this.getValorComercial());
       return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pintura) {
            if(super.equals(obj)){
                if(this.tecnica.equals(((Pintura) obj).tecnica)){
                return true;
                }
            }
        
        }
     return false;   
    }
    
    

 




 
}
