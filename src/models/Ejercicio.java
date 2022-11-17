package models;
import enumerations.GrupoMuscular;
import enumerations.NivelExigencia;

//import java.util.Random;



public class Ejercicio {
	protected String nombre;
	protected GrupoMuscular grupoMuscular;
	protected int nivelAerobico;
	protected NivelExigencia nivelExigencia;
	protected int repeticiones;
	protected int series;
	protected int pesoAsignado;
	protected String videoEj;
	
	public Ejercicio() {
	}

	public  Ejercicio(GrupoMuscular grupoMuscular, int aerobico,NivelExigencia nivel) {
		this.grupoMuscular=grupoMuscular;
		this.nivelAerobico=aerobico;
		this.repeticiones=10;
		this.series=4;
		this.nivelExigencia=nivel;
		this.pesoAsignado = 10;
		this.nombre = grupoMuscular.name();
		//Random aleatorio = new Random();
		//System.out.println(8+aleatorio.nextInt( (10+1) - 8));
		
	}
	
	
	public void verEjercicio() {
		System.out.println("Nombre " + getNombre());
		System.out.println("Series " + getSeries());
		System.out.println("Repeticiones " + getRepeticiones());
		System.out.println("Peso asignado " + getPesoAsignado());
		
		System.out.println("\n");
		
	}



	public String getNombre() {
		return nombre;
	}



	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}



	public int getNivelAerobico() {
		return nivelAerobico;
	}



	public NivelExigencia getNivelExigencia() {
		return nivelExigencia;
	}



	public int getRepeticiones() {
		return repeticiones;
	}



	public int getSeries() {
		return series;
	}



	public int getPesoAsignado() {
		return pesoAsignado;
	}



	public String getVideoEj() {
		return videoEj;
	}
	
	
	
	
}
