
public class Persona {
	private int edad;
	private double peso;
	private double altura;
	private String nombre;
	
	public Persona(int edad, double peso, double altura, String nombre){
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.nombre = nombre;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	public String getNombre() {
		return nombre;
	}

}
