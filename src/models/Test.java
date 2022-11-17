package models;
import adapters.MedidorAdaptado;
import strategies.*;
public class Test {

	public static void main(String[] args) {
		Socio socio = new Socio("juan", "Perez", 1130332656, "123@gmail.com",
		"1234", 25, "masculino", 180, 90);

		
		ObjetivoBajarPeso estrategia1 = new ObjetivoBajarPeso(75);
		ObjetivoTonificarCuerpo estrategia2 = new ObjetivoTonificarCuerpo(socio.getSexo(), socio.getAltura());
		ObjetivoMantenerFigura estrategia3 = new ObjetivoMantenerFigura(75, 3);

		Objetivo obj11 = new Objetivo(socio, estrategia1);

		socio.agregarObjetivo(obj11);
		socio.getObjetivo().generarRutina();
		socio.getObjetivo().verRutina();	
		
		socio.getObjetivo().getRutina().reforzarRutina(1, 1, 2);
		socio.getObjetivo().verRutina();
		
		Trofeo trofeoObservador = new TrofeoCreido(socio);
		socio.agregarObservador(trofeoObservador);
		
		Trofeo trofeoObservador3 = new TrofeoDedicacion(obj11);
		socio.getObjetivo().agregarObservador(trofeoObservador3);
		
		
		
		
		//Trofeo del creido
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		

		//Trofeo a la constancia
		socio.getObjetivo().setEstrategia(estrategia1);
		socio.getObjetivo().generarRutina();
		Trofeo trofeoObservador2 = new TrofeoConstancia(socio,socio.getObjetivo().getRutina());
		socio.getObjetivo().getRutina().agregarObservador(trofeoObservador2);
		//socio.getObjetivo().verRutina();
		socio.getObjetivo().getRutina().completarRutina();
		
		

		//Trofeo de la dedicacion
		socio.getObjetivo().setEstrategia(estrategia3);
		socio.getObjetivo().completarObjetivo();
		
		socio.verTrofeos();

	}

}
