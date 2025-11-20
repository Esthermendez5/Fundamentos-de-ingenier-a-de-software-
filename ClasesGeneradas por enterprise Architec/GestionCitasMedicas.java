
package gestioncitasmedicas;

import javax.swing.*;
import java.awt.*;

public class GestionCitasMedicas extends JFrame {

    private JTextField txtFecha, txtHora, txtNombrePaciente, txtTelefono;
    private JComboBox<String> cbDoctor;
    private JButton btnAgendar;

    Doctor[] doctores = {
            new Doctor("Dr. Juan Pérez", "Pediatría"),
            new Doctor("Dra. María López", "Dermatología"),
            new Doctor("Dr. Carlos Ruiz", "General")
    };

    public GestionCitasMedicas() {
        setTitle("Gestión de Citas Médicas");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        // --- PANEL PRINCIPAL ---
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 247, 250)); // Gris muy suave

        // --- TARJETA (CARD PANEL) ---
        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(Color.WHITE);
        card.setBounds(25, 25, 400, 320);
        card.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));

        JLabel lblTitulo = new JLabel("Agendar Nueva Cita");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setBounds(110, 10, 250, 30);
        card.add(lblTitulo);

        // CAMPOS DEL FORMULARIO
        JLabel l1 = new JLabel("Nombre del paciente:");
        l1.setBounds(20, 60, 150, 20);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(l1);

        txtNombrePaciente = new JTextField();
        txtNombrePaciente.setBounds(175, 58, 200, 25);
        card.add(txtNombrePaciente);

        JLabel l2 = new JLabel("Teléfono:");
        l2.setBounds(20, 95, 150, 20);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(l2);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(175, 93, 200, 25);
        card.add(txtTelefono);

        JLabel l3 = new JLabel("Doctor:");
        l3.setBounds(20, 130, 150, 20);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(l3);

        cbDoctor = new JComboBox<>();
        for (Doctor d : doctores) cbDoctor.addItem(d.nombre);
        cbDoctor.setBounds(175, 128, 200, 25);
        card.add(cbDoctor);

        JLabel l4 = new JLabel("Fecha:");
        l4.setBounds(20, 165, 150, 20);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(l4);

        txtFecha = new JTextField();
        txtFecha.setBounds(175, 163, 200, 25);
        card.add(txtFecha);

        JLabel l5 = new JLabel("Hora:");
        l5.setBounds(20, 200, 150, 20);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(l5);

        txtHora = new JTextField();
        txtHora.setBounds(175, 198, 200, 25);
        card.add(txtHora);

        // BOTÓN ESTILIZADO
        btnAgendar = new JButton("Agendar Cita");
        btnAgendar.setBounds(120, 245, 160, 35);
        btnAgendar.setBackground(new Color(52, 152, 219));
        btnAgendar.setForeground(Color.WHITE);
        btnAgendar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnAgendar.setFocusPainted(false);
        btnAgendar.setBorder(BorderFactory.createEmptyBorder());
        card.add(btnAgendar);

        panel.add(card);
        add(panel);

        // Acción del botón
        btnAgendar.addActionListener(e -> agendarCita());
    }

    private void agendarCita() {
        String nombre = txtNombrePaciente.getText();
        String telefono = txtTelefono.getText();
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        int doctorIndex = cbDoctor.getSelectedIndex();

        if (nombre.isEmpty() || telefono.isEmpty() || fecha.isEmpty() || hora.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.");
            return;
        }

        Paciente paciente = new Paciente(nombre, telefono);
        Doctor doctor = doctores[doctorIndex];

        if (!doctor.actualizarDisponibilidad(hora)) {
            JOptionPane.showMessageDialog(this, "El doctor no está disponible en ese horario.");
            return;
        }

        // Crear la cita
        CitaMedica cita = new CitaMedica(fecha, hora, paciente, doctor);
        Notificacion not = cita.generarNotificacion();

        ServicioNotificaciones servicio = new ServicioNotificaciones();
        servicio.enviarNotificaciones(not);

        JOptionPane.showMessageDialog(this,
                "✔ Cita agendada exitosamente\n\n" +
                        "Doctor: " + doctor.nombre + "\n" +
                        "Fecha:  " + fecha + "\n" +
                        "Hora:   " + hora);

        // ❗ CERRAR EL PROGRAMA DESPUÉS DE AGENDAR
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestionCitasMedicas().setVisible(true));
    }
}
