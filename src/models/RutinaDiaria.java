package models;
import java.util.*;

import enumerations.NivelExigencia;
import enumerations.GrupoMuscular;

public class RutinaDiaria {
	// private Integer cantidadDeDias;
	private List<Entrenamiento> entrenamientos;
	private boolean completada = false;
	private List<Trofeo> observadores;

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

	public void agregarObservador(Trofeo trofeo) {
		observadores.add(trofeo);
	}
	
	public void eliminarObservador(Trofeo trofeo) {
		observadores.remove(trofeo);
	}
	
	public void completarRutina() {
		boolean cumple = true;
		// for (Entrenamiento entrenamiento : entrenamientos) {
		// 	if (entrenamiento.isCompletado() == false) {
		// 		cumple = false;
		// 	}
		// }
		if (cumple) {
			this.completada = true;
			for (Trofeo observador : observadores) {
				observador.chequearPremio();
			}
		}
	}

	public void verRutina() {
		for (Entrenamiento ent : this.entrenamientos) {
			ent.verEntrenamiento();
		}
		
	}
}
