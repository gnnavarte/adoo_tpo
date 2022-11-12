package modelado;

public class Medicion {
	public Medicion(Integer peso, Double masa_corporal, Double grasa_corporal, Date fecha) {
		super();
		this.peso = peso;
		this.masa_corporal = masa_corporal;
		this.grasa_corporal = grasa_corporal;
		this.fecha = fecha;
	}
	private Integer peso;
	public Integer getPeso() {
		return peso;
	}
	public Double getMasa_corporal() {
		return masa_corporal;
	}
	public Double getGrasa_corporal() {
		return grasa_corporal;
	}
	public Date getFecha() {
		return fecha;
	}
	private Double masa_corporal;
	private Double grasa_corporal;
	private Date fecha;
}
