package modelado;
import java.util.*;

import modelado.TrofeosConseguidos;
import moduloObjetivo.Objetivo;


public class Socio {
	public Socio(SocioDTO socio) {
		super();
		this.email = socio.email;
		this.password = socio.password;
		this.nombre = socio.nombre;
		this.apellido = socio.apellido;
		this.edad = socio.edad;
		this.altura = socio.altura;
		this.peso = socio.peso;
	}

	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer altura;
	private Integer peso;
	
	private Objetivo objetivo;
	private List<Medicion> mediciones = new ArrayList();
	private List<Trofeo> trofeos = new ArrayList();
	private List<Trofeo> observadores = new ArrayList();
	
	public void agregarObservador(Trofeo trofeo) {
		observadores.add(trofeo);
	}
	
	public void eliminarObservador(Trofeo trofeo) {
		observadores.remove(trofeo);
	}
	
	public void registrarMedicion(Medicion medicion) {
		mediciones.add(medicion);
		peso = medicion.getPeso();
		for (Trofeo observador : observadores) {
			observador.chequearPremio();
		}
	}

	public List<Medicion> getMediciones() {
		return mediciones;
	}
}
