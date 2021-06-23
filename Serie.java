
public class Serie extends Netflix{
	
	//Atributos:
	private int numTemporadas=1; 
	
	
	//Constructores
	public Serie() {
		super();
	}
	
	public Serie(String titulo, String creador){
		super(titulo, creador);
	}
	
	public Serie(String titulo, String creador, String genero, double duracion, int numTemporadas){
		super(titulo, creador, genero, duracion);
		this.numTemporadas = numTemporadas;
	}

	//getters:
	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	@Override
	public String toString() {
		String informacionNetflix = super.toString();
		return  informacionNetflix + "\n"+
				"-Numero de temporadas: "+ this.numTemporadas;
	}

	
}
