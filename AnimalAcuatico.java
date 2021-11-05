/**
* @author Brigada 4
*/
public class AnimalAcuatico extends Animal{
  private int aletas;
  /**
  * Constructor
  */
  public AnimalAcuatico (){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre del animal acuatico
  * @param lugarOrigen Lugar de origen del animal acuatico
  * @param color Color del animal acuatico
  * @param aletas Aletas del animal acuatico
  */
  public AnimalAcuatico(String nombre, String lugarOrigen, String color,int aletas){
   super(nombre, lugarOrigen, color);
   this.aletas = aletas;
  }
  /*
  * Nadar
  * @return "Estoy nadando"
  */
  public void nadar(){
    System.out.println("Estoy nadando");
  }
  /*
  * Comer
  * @return "Estoy comiendo peces"
  */
  public void comer(){
    System.out.println("estoy comiendo peces");
  }
  /*
  * Getter Aletas
  * @return aletas: Regresa el numero de aletas del animal acuatico
  */
  public int getAletas(){
    return aletas;
  }
  /*
  * Setter Aletas
  * @param aletas Recibe el numero de aletas del animal acuatico
  */
  public void setAletas(int aletas){
    this.aletas = aletas;
  }
  @Override
  public String toString(){
    return super.toString()+"Acuatico { aletas ="+aletas+"}";
  }
}
