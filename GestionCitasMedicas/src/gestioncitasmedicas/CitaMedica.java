
package gestioncitasmedicas;


public class CitaMedica {
    String fecha;
    String hora;
    Paciente paciente;
    Doctor doctor;

    public CitaMedica(String fecha, String hora, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Notificacion generarNotificacion() {
        return new Notificacion(
            "Cita agendada con " + doctor.nombre + " el " + fecha + " a las " + hora,
            paciente.telefono
        );
    }
}
