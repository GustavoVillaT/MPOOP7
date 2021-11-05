/**
* @author Brigada 4
*/
public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;
  /**
  * Constructor
  */
  public Animal(){
  }
  /**
  * Constructor con todos los datos
  * @param nombre Nombre del animal
  * @param lugarOrigen Lugar de origen del animal
  * @param color Color del animal
  */

  public Animal(String nombre, String lugarOrigen, String color){
    this.nombre = nombre;
    this.lugarOrigen = lugarOrigen;
    this.color = color;
  }
  /*
  * Hacer sonido
  * @param sonido String que corresponde al sonido del animal
  * @return "Estoy haciendo un sonido" y el sonido que recibio
  */  
  public void hacerSonido(String sonido){
    System.out.println("estoy haciendo un sonido"+sonido);
  }
  /*
  * Comer
  * @return "Estoy comiendo"
  */  
  public void comer(){
    System.out.println("estoy comiendo");
  }
  /*
  * Setter Nombre
  * @param nombre Recibe el nombre del animal
  */

  public void setNombre(String nombre){
    this.nombre = nombre;
  }  
  /*
  * Getter Nombre  
  * @return nombre: Regresa el nombre del animal
  */
  public String getNombre(){
    return nombre;
  }
  /*
  * Getter Lugar de origen
  * @return lugarOrigen: Regresa el lugar de origen del animal
  */
  public String getLugarOrigen(){
    return lugarOrigen;
  }
  /*
  * Setter Lugar de origen
  * @param lugarOrigen Recibe el lugar de origen del animal
  */  
  public void setLugarOrigen( String lugarOrigen){
    this.lugarOrigen = lugarOrigen;
  }
  /*
  * Getter color
  * @return color Regresa el color del animal
  */
  public String getColor(){
    return color;
  }
  /*
  * Setter Color
  * @param color  Recibe el color del animal
  */
  public void setColor(String color){
    this.color = color;
  }
  @Override
  public String toString(){
    return "Animal{nombre: "+nombre+" lugar de origen: "+lugarOrigen+" color: "+color+"}";
  }

}