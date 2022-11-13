package moduloObjetivo;

import moduloObjetivo.estrategias.*;
import java.util.List;
import modelado.Socio;
import modelado.Trofeo;

public class Objetivo {
	private Socio socio;
	private boolean completado;
	private  EstrategiaObjetivo objetivoStrategy;
	private List<Trofeo> observadores;

	public Objetivo(Socio socio) {
		this.socio = socio;
	}

	public void generarRutina() {
		this.objetivoStrategy.generarRutina();
	}

	public void setEstrategia(EstrategiaObjetivo estrategia){
		this.objetivoStrategy = estrategia;
	}

	public Objetivo(EstrategiaObjetivo objetivoStrategy) {
		this.objetivoStrategy = objetivoStrategy;
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
