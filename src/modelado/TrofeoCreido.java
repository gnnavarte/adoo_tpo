package modelado;
import java.time.LocalDateTime;  

public class TrofeoCreido extends Trofeo {
	private Socio socio;
	@Override
	public void chequearPremio() {
		if (socio.getMediciones().size()>=3) {
			this.fechaConseguido = java.time.LocalDate.now();
			// Notificador.notificar(Notificacion notificacion);
		}
	}
	public TrofeoCreido(Socio socio) {
		super();
		this.nombre = "Trofeo del creido";
		this.descripcion = "se otorga este trofeo a quien se pese más de 3 veces al mes";
		this.fechaConseguido = null;
		this.socio = socio;
	}
	
}
