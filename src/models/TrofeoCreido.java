package models;  

import adapters.FireBase;

public class TrofeoCreido extends Trofeo {
	private Socio socio;

	public TrofeoCreido(Socio socio) {
		super();
		this.nombre = "Trofeo del creido";
		this.descripcion = "se otorga este trofeo a quien se pese más de 3 veces al mes";
		this.fechaConseguido = null;
		this.socio = socio;
	}
	
	@Override
	public void chequearPremio() {
		if (socio.getMediciones().size()>=3) {
			this.fechaConseguido = java.time.LocalDate.now();
			Notificacion notificacion = new Notificacion();
			notificacion.setMensaje("¡Felicitaciones por el trofeo!");
			Notificador.setAdapter(new FireBase());
			Notificador.enviarNotificacion(notificacion);
			
			socio.agregarTrofeo(this);
		
		}
	}
}
