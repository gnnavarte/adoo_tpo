package modelado;
import enumerations.GrupoMuscular;
import enumerations.NivelExigencia;

//import java.util.Random;



public class Ejercicio {
	private String nombre;
	private GrupoMuscular grupoMuscular;
	private int nivelAerobico;
	private NivelExigencia nivelExigencia;
	private int repeticiones;
	private int series;
	private int pesoAsignado;
	
	public  Ejercicio(GrupoMuscular grupoMuscular, int aerobico,NivelExigencia nivel) {
		this.grupoMuscular=grupoMuscular;
		this.nivelAerobico=aerobico;
		this.repeticiones=10;
		this.series=4;
		this.nivelExigencia=nivel;
		//Random aleatorio = new Random();
		//System.out.println(8+aleatorio.nextInt( (10+1) - 8));
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}
	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}
	public int getNivelAerobico() {
		return nivelAerobico;
	}
	public void setNivelAerobico(int nivelAerobico) {
		this.nivelAerobico = nivelAerobico;
	}
	public NivelExigencia getNivelExigencia() {
		return nivelExigencia;
	}
	public void setNivelExigencia(NivelExigencia nivelExigencia) {
		this.nivelExigencia = nivelExigencia;
	}
	public int getRepeticiones() {
		return repeticiones;
	}
	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public int getPesoAsignado() {
		return pesoAsignado;
	}
	public void setPesoAsignado(int pesoAsignado) {
		this.pesoAsignado = pesoAsignado;
	}
	
	
	
}
