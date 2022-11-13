package moduloObjetivo.estrategias;

import enumerations.NivelExigencia;
import modelado.Medicion;
import modelado.RutinaDiaria;

public class ObjetivoTonificarCuerpo implements EstrategiaObjetivo{
	
	private int nivelAerobico=4;
	private NivelExigencia nivel=NivelExigencia.Alto;
	private String sexo;
	private int altura;
	private int porcentajeMasaIdeal;
	private int porcentajeGrasaIdeal;

	public ObjetivoTonificarCuerpo(String sexo, Integer altura) {
		this.sexo = sexo;
		this.altura = altura;
	}

	@Override
	public RutinaDiaria generarRutina() {
		return new RutinaDiaria(nivel,nivelAerobico);
	}

	@Override
	public boolean cumpleObjetivo(Medicion medicion) {

		if (altura > 160 && sexo == "Hombre") {
			porcentajeMasaIdeal = 50;
			porcentajeGrasaIdeal = 40;
		}
		if (altura > 160 && sexo == "Mujer") {
			porcentajeMasaIdeal = 60;
			porcentajeGrasaIdeal = 40;
		}
		if (altura <= 160 && sexo == "Hombre") {
			porcentajeMasaIdeal = 50;
			porcentajeGrasaIdeal = 40;
		}
		if (altura <= 160 && sexo == "Mujer") {
			porcentajeMasaIdeal = 50;
			porcentajeGrasaIdeal = 40;
		}
		return (
		(medicion.getMasa_corporal() > porcentajeMasaIdeal - 5 &&
		medicion.getGrasa_corporal() < porcentajeMasaIdeal + 5)
		&& 
		(medicion.getGrasa_corporal() > porcentajeGrasaIdeal - 5 &&
		medicion.getGrasa_corporal() < porcentajeGrasaIdeal + 5)
		);
	}
	
	

}
