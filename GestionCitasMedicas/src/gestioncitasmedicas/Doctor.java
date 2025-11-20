
package gestioncitasmedicas;


public class Doctor {
    String nombre;
    String especialidad;

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public boolean actualizarDisponibilidad(String hora) {
        return true; // Siempre disponible en esta simulación
    }
    
}
