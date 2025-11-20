
package gestioncitasmedicas;


public class Notificacion {
    String mensaje;
    String destino;

    public Notificacion(String mensaje, String destino) {
        this.mensaje = mensaje;
        this.destino = destino;
    }

    public void enviar() {
        System.out.println("📧 Notificación enviada a " + destino + ": " + mensaje);
    }
}
