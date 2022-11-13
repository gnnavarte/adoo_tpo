package modelado;
import java.util.*;

import enumerations.GrupoMuscular;
import enumerations.NivelExigencia;
import modelado.RutinaDiaria;
import modelado.Ejercicio;

public class Entrenamiento {
	private List<Ejercicio> ejercicios;
	private boolean completado = false;
	
	
	public boolean isCompletado() {
		return completado;
	}

	public Entrenamiento(NivelExigencia nivel, int nivelAerobicoMinimo, GrupoMuscular grupo) {
		this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
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
}
