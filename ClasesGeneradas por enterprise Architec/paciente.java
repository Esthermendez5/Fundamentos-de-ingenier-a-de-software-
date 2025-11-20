

/**
 * @author Usuario
 * @version 1.0
 * @created 19-nov.-2025 0:42:38
 */
public class paciente extends Usuario implements Notificar {

	public String direccion;
	public int edad;
	public Date Fecha nacimiento;
	public String historialMedico;
	public HistorialMedico corresponde;
	public CitaMedica tiene;
	public Notificacion m_Notificacion;

	public paciente(){

	}

	public void finalize() throws Throwable {

	}
	public CitaMedica agendarCita(){
		return null;
	}

	public Boolean cancelarCita(){
		return false;
	}

	public void consultarCita(){

	}

	/**
	 * 
	 * @param mensaje
	 */
	public void enviarNotificaciones(String mensaje){

	}
}//end paciente