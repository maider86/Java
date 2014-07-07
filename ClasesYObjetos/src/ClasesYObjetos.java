
public class ClasesYObjetos {

	public static void main(String[] args) {
		Persona persona = new Persona(27, 60, 1.73, "Maider");
		
		System.out.println("Mi nombre es: "+persona.getNombre());
		System.out.println("Mi peso es: "+persona.getPeso());
		System.out.println("Mi altura es: "+persona.getAltura());
		System.out.println("Mi edad es: "+persona.getEdad());
		persona.setEdad(28);
		System.out.println("Mi edad es: "+persona.getEdad());
		
	}

}
