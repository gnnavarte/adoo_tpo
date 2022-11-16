package models;
import enumerations.GrupoMuscular;
import enumerations.NivelExigencia;

//import java.util.Random;

package models;

public abstract class DecoradorEjercicio extends Ejercicio {
	protected Ejercicio ejercicio;
    protected GrupoMuscular grupoMuscular;
	
	public DecoradorEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}
	
	public void reforzarEjercicio(){
            
    }
        
}