public class Ballena extends AnimalAcuatico {
  private int largo;
  /* 
  * Constructor
  */
  public Ballena(){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre de la ballena
  * @param lugarOrigen Lugar de origen de la ballena
  * @param color Color de la ballena
  * @param aletas Aletas de la ballena
  * @param largo Largo de la ballena.
  */
  public Ballena(String nombre, String lugarOrigen, String color, int aletas , int largo){
  super(nombre, lugarOrigen, color, aletas);
  this.largo = largo;
  }
  /*
  * Pelear con pinocho
  * @return "Estoy peleando con pinocho"
  */ 
  public void pelearConPinocho(){
    System.out.println("estoy peleando con pinocho");
  }
  /*
  * Getter Largo
  * @return largo Regresa lo largo de la ballena
  */
  public int getLargo(){
    return largo;
  }
  /*
  * Setter Largo
  * @param largo Regresa el largo de la ballena
  */
  public void setLargo(int largo){
    this.largo = largo;
  }
  @Override
  public String toString(){
  return super.toString()+"Ballena { largo ="+largo+"}";
  }
}