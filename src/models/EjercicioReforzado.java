
package models;

public class EjercicioReforzado extends DecoradorEjercicio{


    public EjercicioReforzado(Ejercicio ejercicio) {
        super(ejercicio);
    }
    
    public void modificarSets(){  
        ejercicio.setSeries(ejercicio.getSeries() + 1);
    }
    
    public void modificarRepeticiones(){
        ejercicio.setRepeticiones(ejercicio.getRepeticiones() + 2);
    }
    
    public void modificarPeso(){
    ejercicio.setPesoAsignado(ejercicio.getPesoAsignado() + 2.5);
    }

}