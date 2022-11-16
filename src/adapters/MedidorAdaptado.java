package adapters;

import models.Medicion;

public class MedidorAdaptado implements IAdapterMedidor {

    @Override
    public Medicion registrarMedicion() {
        return new Medicion(77, 99.99, 99.99, java.time.LocalDate.now());
    }
    
}
