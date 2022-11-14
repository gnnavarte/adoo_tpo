package models;

import adapters.AdapterFireBase;

public class Notificador {

    private static AdapterFireBase adFirebase;

    public static void setAdapter(AdapterFireBase adFirebase) {
        Notificador.adFirebase = adFirebase;
    }

    public static void enviarNotificacion(Notificacion notificacion) {
        Notificador.adFirebase.enviarNotificacion(notificacion);
    }

}
