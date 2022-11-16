package models;
import java.util.*;

public class Socio {
	private String nombre;
	private String apellido;
	private Integer cel;
	private String email;
	private String password;
	private Integer edad;
	private String sexo;
	private Integer altura;
	private Integer pesoActual;
	private Objetivo objetivo;
	private List<Medicion> mediciones;
	private List<Trofeo> trofeos;
	private List<Trofeo> observadores;
	

	public Socio(String nombre, String apellido, Integer cel, String email, String password, Integer edad, String sexo,
			Integer altura, Integer pesoActual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cel = cel;
		this.email = email;
		this.password = password;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.pesoActual = pesoActual;
		this.mediciones = new ArrayList<Medicion>();
		this.trofeos = new ArrayList<Trofeo>();
		this.observadores = new ArrayList<Trofeo>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public Integer getAltura() {
		return altura;
	}

	public Integer getPesoActual() {
		return pesoActual;
	}

	public void agregarObservador(Trofeo trofeo) {
		observadores.add(trofeo);
	}
	
	public void eliminarObservador(Trofeo trofeo) {
		observadores.remove(trofeo);
	}
	
	public void registrarMedicion(Medicion medicion) {
		mediciones.add(medicion);
		pesoActual = medicion.getPeso();
		for (Trofeo observador : observadores) {
			observador.chequearPremio();
		}
	}

	public List<Medicion> getMediciones() {
		return mediciones;
	}

	public void agregarObjetivo(Objetivo obj) {
		this.objetivo = obj;
		
	}

	public Objetivo getObjetivo() {
		return this.objetivo;
		
	}
	
	public void verTrofeos() {
		System.out.println("trofeos: " + this.trofeos.size());
		for (Trofeo tr : this.trofeos) {
			System.out.println(tr.nombre + tr.descripcion + tr.fechaConseguido);	
			}
		
	}

	public void agregarTrofeo(Trofeo trofeo) {
		this.trofeos.add(trofeo);
		
	}


}
