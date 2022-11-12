package modelado;
import java.util.*;
import modelado.RutinaDiaria;
import modelado.Ejercicio;

public class Entrenamiento {
	private List<Ejercicio> ejercicios;
	private List<Ejercicio> ListadoEjercicios;
	private int duracionSemanas;
	
	
	
	public Entrenamiento(List<Ejercicio> ejercicios,int duracionSemanas) {
		this.ejercicios = ejercicios;
		this.duracionSemanas=duracionSemanas;
	}
	
	


	public Entrenamiento nuevoEntrenamiento() {
		List<Ejercicio> ejercicios = null;
		return new Entrenamiento(ejercicios,4);
	}




	public Entrenamiento nuevoEntrenamiento(int aerobicoMinimo, int aerobicoMaximo) {
		List<Ejercicio> ejercicios = null;
		for (int i = 0;i<ListadoEjercicios.size();i++) {
			Ejercicio ejercicio=ListadoEjercicios.get(i);
			if (ejercicio.getNivelAerobico()>=aerobicoMinimo && ejercicio.getNivelAerobico()<=aerobicoMaximo) {
				ejercicios.add(ejercicio);
			}
		}
		return new Entrenamiento(ejercicios,4);
	}
	
}
