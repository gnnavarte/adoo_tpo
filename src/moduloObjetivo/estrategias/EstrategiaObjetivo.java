package moduloObjetivo.estrategias;

import java.util.ArrayList;

import modelado.Medicion;
import modelado.RutinaDiaria;

public interface EstrategiaObjetivo {
	
	public RutinaDiaria generarRutina();
	public boolean cumpleObjetivo(Medicion medicion);
	

}
