package models;

import adapters.FireBase;

public class TrofeoConstancia extends Trofeo {
	private RutinaDiaria rutina;
	private Socio socio;

	public TrofeoConstancia(Socio socio, RutinaDiaria rutina) {
		super();
		this.nombre = "Trofeo a la constancia";
		this.descripcion = "se otorga este trofeo a aquellos socios que cumplen a la perfección con las rutinas.";
		this.fechaConseguido = null;
		this.rutina = rutina;
		this.socio = socio;
	}

	@Override
	public void chequearPremio() {
		if (rutina.isCompletada()) {
			this.fechaConseguido = java.time.LocalDate.now();
			Notificacion notificacion = new Notificacion();
			notificacion.setMensaje("¡Felicitaciones por el trofeo!");
			Notificador.setAdapter(new FireBase());
			Notificador.enviarNotificacion(notificacion);
			
			this.socio.agregarTrofeo(this);
		
		}
	}
}
