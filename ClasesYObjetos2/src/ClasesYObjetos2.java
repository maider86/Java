
public class ClasesYObjetos2 {

	public static void main(String[] args) {
		Vehiculo vehiculo1 = new Vehiculo("Rojo", 4, 10);
		Vehiculo vehiculo2 = new Vehiculo ();
		Coche coche = new Coche();
		Camion camion = new Camion();
		
		System.out.println("Constructor con parametros");
		System.out.println("\tColor: "+vehiculo1.getColor());
		System.out.println("\tRuedas: "+vehiculo1.getRuedas());
		System.out.println("\tPuertas: "+vehiculo1.getPuertas());
		
		System.out.println("Constructor sin parametros");
		System.out.println("\tColor: "+vehiculo2.getColor());
		System.out.println("\tRuedas: "+vehiculo2.getRuedas());
		System.out.println("\tPuertas: "+vehiculo2.getPuertas());
		
		System.out.println("Color del coche: "+coche.getColor());
		System.out.println("Color del camion: "+camion.getColor());
		
	}

}
