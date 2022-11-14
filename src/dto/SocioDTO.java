package dto;

import models.Socio;

public class SocioDTO {

	private String nombre;
	private String apellido;
	private Integer edad;
	private String sexo;
	private Integer altura;
	private Integer pesoActual;

    public SocioDTO(String nombre, String apellido, Integer edad, String sexo, Integer altura, Integer pesoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.pesoActual = pesoActual;
    }

    public static SocioDTO toDTO(Socio socio) {
        return new SocioDTO(socio.getNombre(), socio.getApellido(), socio.getEdad(), socio.getSexo(), socio.getAltura(), socio.getPesoActual());
    }

}
