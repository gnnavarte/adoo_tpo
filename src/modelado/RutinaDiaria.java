package modelado;
import modelado.Ejercicio;
import java.util.*;
import modelado.Trofeo;

public class RutinaDiaria {
	private List<Entrenamiento> entrenamientos;
	private boolean reforzada;
	private List<Trofeo> observador;
	private boolean completada = false;
	
	
	
	public RutinaDiaria(List<Entrenamiento> entrenamiento, boolean reforzada,  List<Trofeo> observador) {
		this.entrenamientos = entrenamiento;
		this.reforzada = reforzada;
		this.observador=observador;
	}

	public boolean isCompletada() {
		return completada;
	}

	public RutinaDiaria generarRutina(Entrenamiento entrenamiento,boolean reforzada, List<Trofeo> observador) {
		return new RutinaDiaria(this.entrenamientos,this.reforzada,this.observador);
	}
	
	public RutinaDiaria rutinaNueva(int aerobicoMinimo, int AerobicoMaximo) {
		Entrenamiento entrenamiento=new Entrenamiento(null, 4);
		Entrenamiento nuevo=entrenamiento.nuevoEntrenamiento(aerobicoMinimo,AerobicoMaximo);
		boolean asistio=true;
		List<Trofeo> observador = null;
		RutinaDiaria nuevaRutina=generarRutina(nuevo,asistio,observador);
		return nuevaRutina;
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
