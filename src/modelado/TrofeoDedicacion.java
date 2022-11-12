package modelado;
import moduloObjetivo.Objetivo;

public class TrofeoDedicacion extends Trofeo {
	private Objetivo objetivo;
	@Override
	public void chequearPremio() {
		// TODO Auto-generated method stub
		super.chequearPremio();
	}
	public TrofeoDedicacion(Objetivo objetivo) {
		super();
		this.nombre = "Trofeo de la dedicacion";
		this.descripcion = "se otorga este trofeo a aquellos socios que cumplen con su objetivo.";
		this.fechaConseguido = null;
		this.objetivo = objetivo;
	}
	
}
