package models;
import java.util.*;

import enumerations.NivelExigencia;
import enumerations.GrupoMuscular;

public class RutinaDiaria {
	private List<Entrenamiento> entrenamientos;
	private boolean completada = false;
		
	public RutinaDiaria(NivelExigencia nivel, int nivelAerobicoMinimo) {
		this.entrenamientos = new ArrayList<Entrenamiento>();
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Brazos));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Espalda));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Hombros));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Pecho));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Piernas));
	}

	public boolean isCompletada() {
		return completada;
	}
	
	public void completarRutina() {
		boolean cumple = true;
		for (Entrenamiento entrenamiento : entrenamientos) {
			if (entrenamiento.isCompletado() == false) {
				cumple = false;
			}
		}
		if (cumple) {
			this.completada = true;
		}
	}
}
