package strategies;

import enumerations.NivelExigencia;
import models.Medicion;
import models.RutinaDiaria;

public class ObjetivoMantenerFigura implements EstrategiaObjetivo{
	
	private int nivelAerobico=3;
	private NivelExigencia nivel=NivelExigencia.Medio;
	private int pesoMantener;
	private int pesoTolerancia;
	
	public ObjetivoMantenerFigura(int pesoMantener, int pesoTolerancia) {
		this.pesoMantener = pesoMantener;
		this.pesoTolerancia = pesoTolerancia;
	}

	@Override
	public RutinaDiaria generarRutina() {
		return new RutinaDiaria(nivel,nivelAerobico);
	}

	@Override
	public boolean cumpleObjetivo(Medicion medicion) {
		return (pesoMantener-pesoTolerancia < medicion.getPeso() && medicion.getPeso() <= pesoMantener+pesoTolerancia);
	}

}
