
public class ejecutable {
	

	public static void main(String[] args) {
		
		// Crear un arreglo con peliculas
		Pelicula[] peliculas = {new Pelicula("Pulp Fiction","Quentin Tarantino","Drama",178,1994),
								new Pelicula("Inglourious Basterds","Quentin Tarantino"),
								new Pelicula(),
								new Pelicula("Fight Club","David Fincher"),
								new Pelicula("Se7en", "David Fincher", "Suspenso", 127, 1995)};
		
		// Crear un arreglo con series
		Serie[] series = {new Serie("American Horror Story","Ryan Murphy"),
				          new Serie("Modern Family","Christopher Lloyd","Sitcom", 24,11),
						  new Serie(),
						  new Serie("How I Met Your Mother","Carter Bays","Sitcom", 22,9),
						  new Serie()};
		
		// Marcar como visto algunas peliculas y series
		peliculas[0].marcarVisto();
		peliculas[1].marcarVisto();
		peliculas[4].marcarVisto();
		
		series[0].marcarVisto();
		series[3].marcarVisto();
		
		// Mostrar la lista de las peliculas vistas con los minutos visualizados
		System.out.println("Las peliculas vistas son:");
		
		//Constador de numero de peliculas vistas
		int countPelis = 1;
		
		//Por cada pelicula en peliculas
		for(Pelicula pelicula: peliculas) {
			// Si se ha visto
			if(pelicula.esVisto()) {
				//Imprimirlo en la consola
				System.out.println(countPelis+". "+pelicula.getDuracion()+" min. de "+pelicula.getTitulo());
				countPelis += 1;
			}
		}
		
		// Si el contador se queda en 1 es que no hay pelis vistas:
		if(countPelis == 1) {
			System.out.println("No se ha visto ninguna de las peliculas");
		}
		
		System.out.println();
		
		// Mostrar la lista de las series vistas con los minutos visualizados
		System.out.println("Las series vistas son:");
				
		//Constador de numero de peliculas vistas
		int countSeries = 1;
				
		//Por cada pelicula en peliculas
		for(Serie serie: series) {
		    // Si se ha visto
			if(serie.esVisto()) {
				//Imprimirlo en la consola
				System.out.println(countSeries+". "+serie.getDuracion()+" min. de "+serie.getTitulo());
				countSeries += 1;
			}
		}
				
       // Si el contador se queda en 1 es que no hay pelis vistas:
	    if(countSeries == 1) {
			System.out.println("No se ha visto ninguna de las series");
		}
		
	    System.out.println();
	    
		//Indicar la serie con m�s temporadas
	    System.out.println("La serie con m�s temporadas es: ");
	    
	    //Calcular la serie con mayor numero de temporadas
	    int currTemp = 0;
	    Serie serieMasLarga=null;
	    for(Serie serie : series) {
	    	int numTemp = serie.getNumTemporadas();
	    	if(currTemp < numTemp) {
	    		serieMasLarga=serie;
	    		currTemp = numTemp;
	    	}
	    }
	    
	    // Mostrar en pantalla con toda su informaci�n
	    System.out.println(serieMasLarga);
	    
	    System.out.println();
	    
	  //Indicar la pelicula m�s reciente
	    System.out.print("La pelicula m�s reciente es: ");
	    
	    //Calcular la pelicula m�s reciente
	    int currA�o = 0;
	    Pelicula peliMasReciente=null;
	    for(Pelicula pelicula : peliculas) {
	    	int a�o = pelicula.getA�o();
	    	if(currA�o < a�o) {
	    		peliMasReciente = pelicula;
	    		currA�o = a�o;
	    	}
	    }
	    
	    // Mostrar en pantalla con toda su informaci�n
	    System.out.println(peliMasReciente);
	    
	}

}
