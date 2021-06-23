
public class Pelicula extends Netflix{

	// Atributos:
	private int a�o;

	//Constructores:
	public Pelicula() {
		super();
	}
	
	//Un constructor con el t�tulo, creador y visto = false
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
	}
	
	//Un constructor con todos los atributos
	public Pelicula(String titulo, String creador, String genero, double duracion, int a�o) {
		super(titulo, creador, genero, duracion);
		this.a�o = a�o;
	}
	

	public int getA�o() {
		return a�o;
	}
	
	public void setA�o(int a�o) {
		this.a�o=a�o;
	}

	@Override
	public String toString() {
		String informacionNetflix = super.toString();
		return  informacionNetflix + "\n"+
				"-A�o: "+ this.a�o;
	}


	
}
