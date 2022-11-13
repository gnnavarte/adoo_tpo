package moduloObjetivo.estrategias;

import enumerations.NivelExigencia;
import modelado.RutinaDiaria;
import moduloObjetivo.estrategias.*;

public class ObjetivoTonificarCuerpo implements EstrategiaObjetivo{
	
	private int limiteInferiorMinutos;
	private int limiteSuperiorMinutos;
	private int nivelAerobico=4;
	private NivelExigencia nivel=NivelExigencia.Alto;
	
	@Override
	public void generarRutina() {
		RutinaDiaria rutina=new RutinaDiaria(nivel,nivelAerobico);
	}
	
	

}
