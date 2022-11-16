package adapters;

import models.Notificacion;

public class FireBase implements AdapterFireBase{

    public void enviarNotificacion(Notificacion notificacion) {
        // TODO Auto-generated method stub
        System.out.println("Enviando mensaje a " +
                notificacion.getTelefonoDestinatario() + " por FireBase: " +
                "'" + notificacion.getMensaje() + "'"
        );
    }

}