package models;

import java.util.List;
import strategies.EstrategiaObjetivo;

public class Objetivo {
	private Socio socio;
	private boolean completado;
	
	public boolean isCompletado() {
		return completado;
	}

	private  EstrategiaObjetivo objetivoStrategy;
	private List<Trofeo> observadores;

	public Objetivo(Socio socio, EstrategiaObjetivo objetivoStrategy) {
		this.socio = socio;
		this.objetivoStrategy = objetivoStrategy;
	}

	public void generarRutina() {
		this.objetivoStrategy.generarRutina();
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
}
