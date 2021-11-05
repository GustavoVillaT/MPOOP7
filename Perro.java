public class Perro extends AnimalTerrestre {
  private String colorCollar;
  /*
  * Constructor
  */
  public Perro(){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre del perro
  * @param lugarOrigen Lugar de origen del perro
  * @param color Color del perro
  * @param numPatas Patas del perro
  * @param colorcOLLAR Color del collar del perro
  */
  public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar){
   super(nombre, lugarOrigen, color, numPatas);
   this.colorCollar = colorCollar;
  }
  /* 
  * hacerTrucos
  * @return "Estoy haciendo trucos"
  */
  public void hacerTrucos(){
    System.out.println("estoy haciendo trucos");
  }
  /*
  * Getter Color del collar
  * @return colorCollar Regresa el color del collar
  */
  public String getColorCollar(){
    return colorCollar;
  }
  /*
  * Setter Color del collar
  @ param colorCollar Recibe el color del collar
  */
  public void setColorCollar(){
    this.colorCollar = colorCollar;
  }
  @Override
  public String toString(){
  return super.toString()+"Perro{ color del collar ="+colorCollar+"}";
  }
}