package models;

import java.util.ArrayList;
import java.util.List;
import strategies.EstrategiaObjetivo;

public class Objetivo {
	private Socio socio;
	private boolean completado;
	private RutinaDiaria rutina;
	
	public RutinaDiaria getRutina() {
		return rutina;
	}

	public boolean isCompletado() {
		return completado;
	}

	private  EstrategiaObjetivo objetivoStrategy;
	private List<Trofeo> observadores;

	public Objetivo(Socio socio, EstrategiaObjetivo objetivoStrategy) {
		this.socio = socio;
		this.objetivoStrategy = objetivoStrategy;
		this.observadores =new ArrayList<Trofeo>();
	}

	public void agregarObservador(Trofeo trofeo) {
		observadores.add(trofeo);
	}
	
	public void eliminarObservador(Trofeo trofeo) {
		observadores.remove(trofeo);
	}

	public void generarRutina() {
		this.rutina = this.objetivoStrategy.generarRutina();
	}

	public void setEstrategia(EstrategiaObjetivo estrategia){
		this.objetivoStrategy = estrategia;
	}
	
	public void completarObjetivo(){
		if(objetivoStrategy.cumpleObjetivo(socio.getMediciones().get(0))){
			this.completado = true;
			for (Trofeo observador : observadores) {
				observador.chequearPremio();
			}
		};
	}

	public void verRutina() {
		this.rutina.verRutina();
		
	}
	
	// REVISAR SI ESTA BIEN ESTO
	public void agregarTrofeo(Trofeo trofeo) {
		this.socio.agregarTrofeo(trofeo);
	}
}
