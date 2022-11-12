package modelado;
import modelado.Ejercicio;
import java.util.*;
import modelado.Trofeo;

public class RutinaDiaria {
	private List<Entrenamiento> entrenamiento;
	private boolean reforzada;
	private List<Trofeo> observador;
	
	
	
	public RutinaDiaria(List<Entrenamiento> entrenamiento, boolean reforzada,  List<Trofeo> observador) {
		this.entrenamiento = entrenamiento;
		this.reforzada = reforzada;
		this.observador=observador;
	}

	public RutinaDiaria generarRutina(Entrenamiento entrenamiento,boolean reforzada, List<Trofeo> observador) {
		return new RutinaDiaria(this.entrenamiento,this.reforzada,this.observador);
	}
	
	public RutinaDiaria rutinaNueva(int aerobicoMinimo, int AerobicoMaximo) {
		Entrenamiento entrenamiento=new Entrenamiento(null, 4);
		Entrenamiento nuevo=entrenamiento.nuevoEntrenamiento(aerobicoMinimo,AerobicoMaximo);
		boolean asistio=true;
		List<Trofeo> observador = null;
		RutinaDiaria nuevaRutina=generarRutina(nuevo,asistio,observador);
		return nuevaRutina;
	}
	
	
}
