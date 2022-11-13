package moduloObjetivo.estrategias;

import enumerations.NivelExigencia;
import modelado.RutinaDiaria;
import moduloObjetivo.estrategias.*;

public class ObjetivoMantenerFigura implements EstrategiaObjetivo{
	
	private int limiteInferiorMinutos;
	private int limiteSuperiorMinutos;
	private int nivelAerobico=3;
	private int unidades;
	private NivelExigencia nivel=NivelExigencia.Medio;
	
	@Override
	public void generarRutina() {
		RutinaDiaria rutina=new RutinaDiaria(nivel,nivelAerobico);
	}

}
