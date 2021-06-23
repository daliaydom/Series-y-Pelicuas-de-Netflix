
public interface Visualizable {

	// Cambia el atributo de visto a true
	public void marcarVisto();
	
	//Devuelve el estado del atributo visto
	public boolean esVisto();
	
	//Devuelve el tiempo en minutos que se visualizó el video
	public double tiempoVisto( );
}
