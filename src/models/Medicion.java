package models;
import java.time.LocalDate;

public class Medicion {
	public Medicion(Integer peso, double masa_corporal, double grasa_corporal, LocalDate localDate) {
		super();
		this.peso = peso;
		this.masa_corporal = masa_corporal;
		this.grasa_corporal = grasa_corporal;
		this.fecha = localDate;
	}
	private Integer peso;
	private Double masa_corporal;
	private Double grasa_corporal;
	private LocalDate fecha;

	public Integer getPeso() {
		return peso;
	}
	public Double getMasa_corporal() {
		return masa_corporal;
	}
	public Double getGrasa_corporal() {
		return grasa_corporal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
}
