package moduloObjetivo;

import moduloObjetivo.estrategias.*;

public class Objetivo {
	private  EstrategiaObjetivo objetivoStrategy;
	
	public void generarRutina() {
		this.objetivoStrategy.generarRutina();
	}

	public void setEstrategia(EstrategiaObjetivo estrategia){
		this.objetivoStrategy=objetivoStrategy;
	}
	

}
