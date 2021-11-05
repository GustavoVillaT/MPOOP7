/**
* @author Brigada 4
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger= new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(654789);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);
    System.out.println("##############");
    Gerente ger2 = new Gerente("Samuel Torres", 895632, 15_000, 25_000);
    System.out.println(ger2);

    System.out.println("#####################");

    Ballena ballena1 = new Ballena();
    ballena1.setNombre("Moby dick");
    System.out.println(ballena1.getNombre());

    System.out.println("##########################################");
    Perro perro1 = new Perro("chirris","Mexico","negro",4,"verde");
    System.out.println(perro1);

    System.out.println("##########################");
    Pajaro pajaro1 = new Pajaro("Piolin","Mozambique","negro",8,"bonito");
    System.out.println(pajaro1);
  }
}