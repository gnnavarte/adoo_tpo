package modelado;

public class TrofeoConstancia extends Trofeo {
	private RutinaDiaria rutina;

	@Override
	public void chequearPremio() {
		if (rutina.isCompletada()) {
			this.fechaConseguido = java.time.LocalDate.now();
			// Notificador.notificar(Notificacion notificacion);
		}
	}

	public TrofeoConstancia(RutinaDiaria rutina) {
		super();
		this.nombre = "Trofeo a la constancia";
		this.descripcion = "se otorga este trofeo a aquellos socios que cumplen a la perfección con las rutinas.";
		this.fechaConseguido = null;
		this.rutina = rutina;
	}

}
