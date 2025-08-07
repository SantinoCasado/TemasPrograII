/*

 */
package Entidades;


public class Escultura extends ObraArte implements IVendible{
    private MaterialEscultura material;

        public Escultura(  String titulo, Double valor,Artista artista,MaterialEscultura material) {
        super(artista, titulo, valor);
        this.material = material;
    }

   

    @Override
    public double getValorComercial() {
          if(this.material== MaterialEscultura.BRONCE) {
      this.valor = this.valor*1.2;
      }else if (this.material== MaterialEscultura.MADERA){
          this.valor = this.valor*1.3;
      }else if (this.material== MaterialEscultura.MARMOL){
      this.valor = this.valor*1.1;
      }
        return this.valor;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(super.toString()).append("Material: ").append(this.material).append("\n");
       sb.append("valor: ").append(this.getValorComercial());
       return sb.toString();
    }
    
    
}
