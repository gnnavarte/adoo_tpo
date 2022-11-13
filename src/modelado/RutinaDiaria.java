package modelado;
import modelado.Ejercicio;

import java.util.*;
import modelado.Trofeo;
import enumerations.NivelExigencia;
import enumerations.GrupoMuscular;

public class RutinaDiaria {
	private List<Entrenamiento> entrenamientos;
	private boolean reforzada;
	private List<Trofeo> observador;
	private boolean completada = false;
	
	// agregar y eliminar observador
	
	public RutinaDiaria(NivelExigencia nivel, int nivelAerobicoMinimo) {
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Brazos));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Espalda));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Hombros));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Pecho));
		this.entrenamientos.add(new Entrenamiento(nivel,nivelAerobicoMinimo,GrupoMuscular.Piernas));
	}

	public boolean isCompletada() {
		return completada;
	}

	/*
	public RutinaDiaria generarRutina(Entrenamiento entrenamiento,boolean reforzada, List<Trofeo> observador) {
		return new RutinaDiaria(this.entrenamientos,this.reforzada,this.observador);
	}
	*/
	
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
