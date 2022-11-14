package strategies;

import java.util.ArrayList;

import models.Medicion;
import models.RutinaDiaria;

public interface EstrategiaObjetivo {
	
	public RutinaDiaria generarRutina();
	public boolean cumpleObjetivo(Medicion medicion);
	

}
