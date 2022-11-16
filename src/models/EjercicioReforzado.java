
package models;

public class EjercicioReforzado extends Ejercicio{
    private Integer repsAdicional;
    private Integer seriesAdicional;
    private Integer pesoAdicional;
    private Ejercicio ejercicio;

    public EjercicioReforzado(Ejercicio ej, Integer repsAdicional, Integer seriesAdicional, Integer pesoAdicional) {
        this.ejercicio = ej;
        this.nombre = ej.getNombre();
        this.repsAdicional = repsAdicional;
        this.seriesAdicional = seriesAdicional;
        this.pesoAdicional = pesoAdicional;
    }

    @Override
	public int getSeries() {
		return ejercicio.getSeries() + seriesAdicional;
	}

    @Override
    public int getRepeticiones() {
		return ejercicio.getRepeticiones() + repsAdicional;
	}

    @Override
    public int getPesoAsignado() {
		return ejercicio.getPesoAsignado() + pesoAdicional;
	}

}