public class Empleado{
  private String nombre;
  private int numEmpleado;
  private int sueldo;
  /* 
  * Constructor
  */
  public Empleado(){
  }
  /*
  * Constructor con todos los datos
  * @param nombre Nombre del empleado
  * @param numEmpleado Numero del empleado
  * @param sueldo Sueldo del empleado
  */
  public Empleado(String nombre, int numEmpleado, int sueldo){
    this.nombre = nombre;
    this.numEmpleado = numEmpleado;
    this.sueldo = sueldo;
  }
  /*
  * Aumentar Sueldo
  * @return sueldo+ Regresa el sueldo multiplicado por la division de porcentaje entre mil
  */
  public void aunmentarSueldo(int porcentaje){
    sueldo += (sueldo * porcentaje/100);
  }
  /*
  * Getter Nombre
  * @return nombre Regresa el nombre del empleado
  */
  public String getNombre(){
    return nombre;
  }
  /*
  * Setter Nombre
  * @param nombre Regresa el nombre del empleado
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  /*
  * Getter Numero Empleado
  * @return Regresa el numero de empleado
  */
  public int getNumEmpleado(){
  return numEmpleado;
  }
  /*
  * Setter Numero empleado
  * @param nombre Regresa el numero del empleado
  */
  public void setNumEmpleado(int numEmpleado){
    this.numEmpleado= numEmpleado;
  }
  /*
  * Getter Sueldo
  * @return nombre Regresa el sueldo del empleado
  */
  public int getSueldo(){
    return sueldo;
  }
  /*
  * Setter Sueldo
  * @param nombre Regresa el sueldo del empleado
  */
  public void setSueldo(int sueldo){
    if(sueldo>= 0)
      this.sueldo = sueldo;
    else 
      this.sueldo = 0; //Math.abs(sueldo);
  }
  //sobreescritura
  @Override
  public String toString(){
  return "Empleado{ nombre ="+nombre+" numEmpleado ="+numEmpleado+" sueldo ="+sueldo+"$}";
  }
}