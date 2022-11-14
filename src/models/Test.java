package models;
import adapters.MedidorAdaptado;
import models.*;
import strategies.*;
public class Test {

	public static void main(String[] args) {
		Socio socio = new Socio("123@gmail.com", "1234", "juan", "Perez", 25, "masculino", 180, 90);
		
		ObjetivoBajarPeso obj1 = new ObjetivoBajarPeso(75);
		ObjetivoMantenerFigura obj2 = new ObjetivoMantenerFigura(75, 3);
		ObjetivoTonificarCuerpo obj3 = new ObjetivoTonificarCuerpo(socio.getSexo(), socio.getAltura());
		
		
		
		Objetivo obj11 = new Objetivo(socio, obj1);
		Objetivo obj22 = new Objetivo(socio, obj2);
		Objetivo obj33 = new Objetivo(socio, obj3);
		
		socio.agregarObjetivo(obj11);
		
		socio.getObjetivo().generarRutina();
		
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		socio.registrarMedicion(new MedidorAdaptado().registrarMedicion());
		
		socio.getObjetivo().verRutina();
	
		
		
		
		
		
		
		
		System.out.println("prueba funcionamiento");
	}

}
