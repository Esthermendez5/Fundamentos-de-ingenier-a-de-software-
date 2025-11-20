
package gestioncitasmedicas;


public class ServicioNotificaciones implements InterfazNotificar {

    @Override
    public void enviarNotificaciones(Notificacion notificacion) {
        notificacion.enviar();
    }
}
