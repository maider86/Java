
public class Vehiculo {

	protected String color; //Private implica que la propiedad no va a poder ser accedida ni heredada desde cualquier otra clase
	protected int ruedas; //Protected implica que la propiedad no va a poder ser accedida desde otra clase, pero si va a poder ser heredada
	protected int puertas;
	protected String patente;  
	
	public Vehiculo (String color, int ruedas, int puertas){
		this.color = color;
		this.ruedas = ruedas;
		this.puertas = puertas;
	}
	
	public Vehiculo (){
		this.color = "Verde";
		this.ruedas = 10;
		this.puertas = 2;
	}

	public String getColor() {
		return color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getPuertas() {
		return puertas;
	}
	
}
