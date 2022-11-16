package models;

import adapters.FireBase;

public class TrofeoDedicacion extends Trofeo {
	private Objetivo objetivo;

	public TrofeoDedicacion(Objetivo objetivo) {
		super();
		this.nombre = "Trofeo de la dedicacion";
		this.descripcion = "se otorga este trofeo a aquellos socios que cumplen con su objetivo.";
		this.fechaConseguido = null;
		this.objetivo = objetivo;
	}
	
	@Override
	public void chequearPremio() {
		if (objetivo.isCompletado()) {
			Notificacion notificacion = new Notificacion();
			notificacion.setMensaje("¡Felicitaciones por el trofeo!");
			Notificador.setAdapter(new FireBase());
			Notificador.enviarNotificacion(notificacion);
		}
	}
}
