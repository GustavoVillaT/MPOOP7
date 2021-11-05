public class AnimalTerrestre extends Animal{
  private int numPatas;
  /*
  * Constructor
  */
  public AnimalTerrestre(){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre del animal terrestre  
  * @param lugarOrigen Lugar de origen del animal terrestre
  * @param color Color del animal terrestre
  * @param numPatas Patas del animal terrestre
  */
  public AnimalTerrestre(String nombre, String lugarOrigen, String color,int numPatas){
   super(nombre, lugarOrigen, color);
   this.numPatas = numPatas;
  }
  /*
  * correr
  * @return "Estoy corriendo"
  */
  public void correr(){
    System.out.println("Estoy corriendo");
  }
  /*
  * Comer
  * @return "Estoy comiendo animales"
  */
  public void comer(){
    System.out.println("estoy comiendo animales");
  }
  /*
  * Getter Numero de patas
  * @return numPatas Regresa el numero de patas
  */
  public int getNumPatas(){
  return numPatas;
  }
  /*
  * Setter Numero de patas
  * @param numPatas Recibe el numero de patas
  */
  public void setNumPatas(int numPatas){
    this.numPatas = numPatas;
  }
  @Override
  public String toString(){
  return super.toString()+"Terrestre {numero de patas  ="+numPatas+"}";
  
}
}