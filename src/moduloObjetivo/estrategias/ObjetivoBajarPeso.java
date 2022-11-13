package moduloObjetivo.estrategias;

import moduloObjetivo.estrategias.EstrategiaObjetivo;

import enumerations.NivelExigencia;
import modelado.RutinaDiaria;

public class ObjetivoBajarPeso implements EstrategiaObjetivo{
	
	private int limiteInferiorMinutos;
	private int limiteSuperiorMinutos;
	private int nivelAerobico=3;
	private NivelExigencia nivel=NivelExigencia.Bajo;
	

	@Override
	public void generarRutina() {
		RutinaDiaria rutina=new RutinaDiaria(nivel,nivelAerobico);
	}

}
