package models;
import java.util.*;

import enumerations.GrupoMuscular;
import enumerations.NivelExigencia;
import models.Ejercicio;

public class Entrenamiento {
	private List<Ejercicio> ejercicios;
	private boolean completado = false;
	
	
	public boolean isCompletado() {
		return completado;
	}

	public Entrenamiento(NivelExigencia nivel, int nivelAerobicoMinimo, GrupoMuscular grupo) {
		this.ejercicios = new ArrayList<Ejercicio>();
		this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
		this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
		this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
	}


	public Entrenamiento(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}
	
	


	public Entrenamiento nuevoEntrenamiento() {
		List<Ejercicio> ejercicios = null;
		return new Entrenamiento(ejercicios);
	}
		
	public void completarEntrenamiento() {
		this.completado = true;
	}

	public void verEntrenamiento() {
		for (Ejercicio ej : this.ejercicios) {
			ej.verEjercicio();
		}
		
	}

	public void reforzarEntrenamieno(Integer repsAdicional, Integer seriesAdicional, Integer pesoAdicional) {
		List<Ejercicio> aux = new ArrayList<Ejercicio>();
		for (Ejercicio ej : this.ejercicios) {
			EjercicioReforzado ejr = new EjercicioReforzado(ej, repsAdicional, seriesAdicional, pesoAdicional);
			aux.add(ejr);
		}
		this.ejercicios = aux;
	}
}
