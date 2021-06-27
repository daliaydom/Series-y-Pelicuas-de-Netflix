import java.util.ArrayList;

public class ejecutable {
	

	public static void main(String[] args) {
		
		// Crear un ArrayList con peliculas
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		// Crear y agregar 5 peliculas en el ArrayList:
		
		Pelicula peli1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", "Suspenso", 127, 1995);
		Pelicula peli2 = new Pelicula("Inglourious Basterds","Quentin Tarantino");
		Pelicula peli3 = new Pelicula();
		Pelicula peli4 = new Pelicula("Fight Club","David Fincher");
		Pelicula peli5 = new Pelicula("Se7en", "David Fincher", "Suspenso", 127, 1995);
		
		peliculas.add(peli1);
		peliculas.add(peli2);
		peliculas.add(peli3);
		peliculas.add(peli4);
		peliculas.add(peli5);
		
		// Crear un ArrayList con series
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		// Crear y agregar 5 series en el ArrayList:
		Serie serie1 = new Serie("American Horror Story","Ryan Murphy");
		Serie serie2 = new Serie("Modern Family","Christopher Lloyd","Sitcom", 24,11);
		Serie serie3 = new Serie();
		Serie serie4 = new Serie("How I Met Your Mother","Carter Bays","Sitcom", 22,9);
		Serie serie5 = new Serie();
		
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		series.add(serie4);
		series.add(serie5);
		
		// Marcar como visto algunas peliculas 
		int[] indexPelis = {0,1,5};
		
		try {
			for(int i : indexPelis ) { 
				peliculas.get(i).marcarVisto();
			}
		}catch(IndexOutOfBoundsException indexE){
			System.out.println("Estás intentando entrar a una localidad no definida");
			System.out.println("Ingresa de nuevo los indices de peliculas que marcas como visto");
			System.out.println();
		}
		
		// Marcar como visto algunas series
		
		int[ ] indexSeries = {0,3};
		
		try {
			for(int i : indexSeries) {
				series.get(i).marcarVisto();
			}
		}catch(IndexOutOfBoundsException indexE){
			System.out.println("Estás intentando entrar a una localidad no definida");
			System.out.println("Ingresa de nuevo los indices de series que marcas como visto");
			System.out.println();
		}

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
	    
		//Indicar la serie con más temporadas
	    System.out.println("La serie con más temporadas es: ");
	    
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
	    
	    // Mostrar en pantalla con toda su información
	    System.out.println(serieMasLarga);
	    
	    System.out.println();
	    
	  //Indicar la pelicula más reciente
	    System.out.println("La pelicula más reciente es: ");
	    
	    //Calcular la pelicula más reciente
	    int currAño = 0;
	    Pelicula peliMasReciente=null;
	    for(Pelicula pelicula : peliculas) {
	    	int año = pelicula.getAño();
	    	if(currAño < año) {
	    		peliMasReciente = pelicula;
	    		currAño = año;
	    	}
	    }
	    
	    // Mostrar en pantalla con toda su información
	    System.out.println(peliMasReciente);
	    
	}

}
