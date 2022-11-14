package models;
import java.util.*;

public class Socio {

	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String sexo;
	private Integer altura;
	private Integer pesoActual;
	private Objetivo objetivo;
	private List<Medicion> mediciones;
	private List<Trofeo> trofeos;
	private List<Trofeo> observadores;
	
	public Socio(String email, String password, String nombre, String apellido, Integer edad, String sexo,
			Integer altura, Integer pesoActual) {
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.pesoActual = pesoActual;
		this.mediciones = new ArrayList<Medicion>();
		this.trofeos= new ArrayList<Trofeo>();
		this.observadores= new ArrayList<Trofeo>();
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
}
