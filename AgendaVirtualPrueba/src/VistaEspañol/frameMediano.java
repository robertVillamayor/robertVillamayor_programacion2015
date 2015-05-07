package VistaEspañol;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frameMediano extends JFrame {

	public static JPanel contentPane = new JPanel();
	public static String nombreVistaMensajeProfesor = "MensajeProfesor";
	public static String nombreVistaNuevoMensaje = "NuevoMensaje";
	public static String nombreVistaMensajeAlumno = "MensajeAlumno";
	public static String nombreVistaLeerMensaje = "LeerMensaje";

	
	public frameMediano() {		

		VistaTareas tareas = new VistaTareas(this);
		VistaMensajeProfesor profesor = new VistaMensajeProfesor(this);
		VistaNuevoMensaje nuevoMensaje = new VistaNuevoMensaje(this);
		VistaMensajeAlumno alumno = new VistaMensajeAlumno(this); 
		VistaLeerMensaje leerMensaje = new VistaLeerMensaje(this);
		
		setBounds(100, 100, 806, 528);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAlumno.class.getResource("/images/icono.png")));
		setContentPane(profesor);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(profesor, nombreVistaMensajeProfesor);
		contentPane.add(nuevoMensaje,nombreVistaNuevoMensaje);
		contentPane.add(alumno,nombreVistaMensajeAlumno);
		contentPane.add(leerMensaje, nombreVistaLeerMensaje);
		
		setTitle("Agenda Virtual");
		
		}
	
	
	public void cambiaContenedor (JPanel e){
		this.setContentPane(e);
		this.setVisible(true);
	}
	
	
}
