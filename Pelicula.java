
public class Pelicula extends Netflix{

	// Atributos:
	private int año;

	//Constructores:
	public Pelicula() {
		super();
	}
	
	//Un constructor con el título, creador y visto = false
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
	}
	
	//Un constructor con todos los atributos
	public Pelicula(String titulo, String creador, String genero, double duracion, int año) {
		super(titulo, creador, genero, duracion);
		this.año = año;
	}
	

	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año=año;
	}

	@Override
	public String toString() {
		String informacionNetflix = super.toString();
		return  informacionNetflix + "\n"+
				"-Año: "+ this.año;
	}


	
}
