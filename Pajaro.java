public class Pajaro extends AnimalAereo {
  private String tipoPico;
  /*  
  * Constructor
  */
  public Pajaro(){  
  }
  /*
  * Constructor
  * @param nombre Nombre del pajaro
  * @param lugarOrigen Lugar de origen del pajaro
  * @param color Color del animal pajaro
  * @param aletas Alas del pajaro
  * @param tipoPico Tipo de pico del pajaro
  */
  public Pajaro(String nombre, String lugarOrigen, String color, int numAlas,String tipoPico){
  super(nombre, lugarOrigen, color, numAlas);
  this.tipoPico = tipoPico;
  }
  /*
  
  * @return "Estoy recolectando ramas"
  */
  public void recolectarRamas(){
    System.out.println("estoy recolectando ramas");
  }
  /*
  * Getter tipo de pico
  * @return tipoPico: Regresa el tipo de pico del pajaro
  */
  public String getTipoPico(){
  return tipoPico;
  }
  /*
  * @param tipoPico Recibe el tipo de pico del pajaro
  */
  public void setTipoPico(String tipoPico){
    this.tipoPico = tipoPico;
  }
  @Override
  public String toString(){
    return super.toString()+" Pajaro{tipo de pico: "+tipoPico+"}";
  }
}