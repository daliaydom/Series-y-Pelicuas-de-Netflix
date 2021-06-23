# Series-y-Pelicuas-de-Netflix 
### Por: Dalia Yvette Domínguez Jiménez

En este proyecto se utiliza la programación orientada a objetos en Java para crear objetos Peliculas y Series de Netflix, guardar sus caracteristicas, por mencionar algunas: titulo, creador, genero, entre otras; mostrar filmografíaque  ya fue visualizada, mostrar la información de la programación, calcular la pelicula más reciente y la serie con más temporadas.

## Archivos con breve descripción:

- ejecutable.java (main method):
    - Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.
    - Crea un objeto en cada posición del array. Se usan distintos constructores.
    - Marca en visto algunas Películas y Series con el método marcarVisto()
    - Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos visualizados.
    - Indica la serie con más temporadas y la película del año más reciente. Los miestra en pantalla con toda su información (usa el método toString()).

- Visualizable.java (Interfaz):
     - marcarVisto() cambia el atributo de visto a true.
     - esVisto() devuelve el estado del atributo visto.
     - tiempoVisto() devuelve el tiempo en minutos que se visualizó el video.

- Netflix.java (SuperClass):
     - Contiene los getters and setters que Serie y Pelicula heredan.
     - Contine toSring que sus subclases sobreescriben.

- Serie.java (Subclass):
     - Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.
     - Por default, el número de temporadas es 1 y visto false.
     - Métodos get de todos los atributos, excepto visto.
     - Métodos set de todos los atributos, excepto visto.
     - Sobrescribe el método toString

- Pelicula.java (Subclass):
     - Atributos: titulo, genero, creador, año, duracion y visto.
     - Métodos get de todos los atributos, excepto visto.
     - Métodos set de todos los atributos, excepto visto.
     - Sobreescribe el método toString.

## Resumen de clases

|                                                           Netflix  (Super Clase)                                            |
|:---------------------------------------------------------------------------------------------------------------------------:|
| getTitulo() 
setTitulo() 
getGenero() 
setGenero() 
getCreador() 
setCreador() 
setDuracion() 
setDuracion() 
setVisto() 
toString() |  

|        Pelicula  (Subclase)  |
|:----------------------------:|
| getAño() 
setAño() 
toString() |

|        Serie  (Subclase)  |
|:----------------------------:|
| getNumTemporadas() 
setNumTemporadas() 
toString() |

|        Visualizable  (Interfaz)  |
|:----------------------------:|
| marcarVisto() 
esVisto() 
tiempoVisto() |

## Bibliografía:

Este es el proyecto final del la segunda semana del curso de "Programando con Java para aplicaciones Android", impartido por la UNAM a través de Coursera, en la siguiente especialización:

[Desarrollo de aplicaciones móviles con Android Specialization](https://www.coursera.org/specializations/programacion-android)
