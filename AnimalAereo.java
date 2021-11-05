/**
* @author Brigada 4
*/
public class AnimalAereo extends Animal{
  private int numAlas;
  /**
  * Constructor
  */
  public AnimalAereo(){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre del animal aereo
  * @param lugarOrigen Lugar de origen del animal aereo
  * @param color Color del animal aereo
  * @param numAlas Alas del animal aereo
  */
  public AnimalAereo(String nombre, String lugarOrigen, String color,int numAlas){
   super(nombre, lugarOrigen, color);
   this.numAlas = numAlas;
  }
  /*
  * Volar
  * @return "Estoy volando"
  */
  public void volar(){
    System.out.println("Estoy volando");
  }
  /*
  * Comer
  * @return "Estoy comiendo ratones"
  */
  public void comer(){
    System.out.println("Estoy comiendo ratones"); 
  }
  /*
  * Getter numero de alas
  * @return numAlas: Regresa el numero de alas del animal aereo
  */
  public int getNumAlas(){
    return numAlas;
  }
  /*
  * Setter numero de Alas
  * @param numAlas
  */
  public void setNumAlas(int numAlas){
    this.numAlas = numAlas;
  }
  @Override
  public String toString(){
    return super.toString()+" Aereo{"+numAlas+"}";
  }
}