public class Gerente extends Empleado{
  private int presupuesto;
  /*
    * Constructor
    */
  public Gerente(){
  /*
    * Constructor con todos los datos
    * @param nombre Nombre del gerente  
    * @param numEmpleado Numero de empleado del gerente
    * @param sueldo Sueldo del gerente
    * @param presupuesto Presupuesto del gerente
  */
  }
  public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto){
   super(nombre, numEmpleado, sueldo);
   this.presupuesto =presupuesto;
  }
  /*
    * Getter Presupuesto
    * @return Regresa el presupuesto del gerente
  */
  public int getPresupuesto(){
   return presupuesto;
  /*
    * Setter Presupuesto
    * @param Recibe el presupuesto del gerente
  */
  }
  public void setPresupuesto(int presupuesto){
   if(presupuesto>=0)
   this.presupuesto = presupuesto;
  }
  //sobrescritura
  @Override
  public String  getNombre(){
   return super.getNombre() + " mucho gusto";
  }

  public String toString(){
    return super.toString()+"Gerente{ presupuesto ="+presupuesto+"$}";
  }
}