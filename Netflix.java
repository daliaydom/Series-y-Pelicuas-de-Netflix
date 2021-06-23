
public class Netflix implements Visualizable {
	
	//Atributos
	private String titulo;
	private String genero;
	private String creador;
	private double duracion; //en minutos
	private boolean visto = false;
	

	public Netflix() {
		// TODO Auto-generated constructor stub
	}
	
	public Netflix(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Netflix(String titulo, String creador, String genero, double duracion) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.duracion = duracion;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = true;
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}

	@Override
	public double tiempoVisto() {
		// TODO Auto-generated method stub
		return this.duracion;
	}
	
	@Override
	public String toString() {
		return  "-Titulo: "+this.getTitulo()+"\n"+
	            "-Creador: "+this.getCreador()+"\n"+
				"-Genero: "+this.getGenero()+"\n"+
	            "-Duración: "+this.getDuracion()+" min.";
	}
	
	
}
