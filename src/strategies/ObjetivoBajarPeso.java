package strategies;

import enumerations.NivelExigencia;
import models.Medicion;
import models.RutinaDiaria;

public class ObjetivoBajarPeso implements EstrategiaObjetivo{
	
	private int nivelAerobico=3;
	private NivelExigencia nivel=NivelExigencia.Bajo;
	private int pesoObjetivo;
	
	public ObjetivoBajarPeso(int pesoObjetivo) {
		this.pesoObjetivo = pesoObjetivo;
	}

	@Override
	public RutinaDiaria generarRutina() {
		return new RutinaDiaria(nivel,nivelAerobico);
	}

	@Override
	public boolean cumpleObjetivo(Medicion medicion) {
		return medicion.getPeso() == pesoObjetivo;
	}

}
