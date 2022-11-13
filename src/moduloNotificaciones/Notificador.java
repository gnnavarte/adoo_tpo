package moduloNotificaciones;

import adapter.AdapterFireBase;

public class Notificador {

    private AdapterFireBase adFirebase;

    public void setAdapter(AdapterFireBase adFirebase) {
        this.adFirebase = adFirebase;
    }

    public void enviarNotificacion(Notificacion notificacion) {
        this.adFirebase.enviarNotificacion(notificacion);
    }

}
