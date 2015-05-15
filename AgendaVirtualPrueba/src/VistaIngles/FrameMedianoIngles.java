package VistaIngles;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameMedianoIngles extends JFrame {

	public static JPanel contentPane = new JPanel();
	public static String nombreVistaMensajeProfesor = "MensajeProfesor";
	public static String nombreVistaNuevoMensaje = "NuevoMensaje";
	public static String nombreVistaMensajeAlumno = "MensajeAlumno";
	public static String nombreVistaLeerMensaje = "LeerMensaje";

	
	public FrameMedianoIngles() {		

		VistaTareasIngles tareas = new VistaTareasIngles(this);
		VistaMensajeProfesorIngles profesor = new VistaMensajeProfesorIngles(this);
		VistaNuevoMensajeIngles nuevoMensaje = new VistaNuevoMensajeIngles(this);
		VistaMensajeAlumnoIngles alumno = new VistaMensajeAlumnoIngles(this); 
		VistaLeerMensajeIngles leerMensaje = new VistaLeerMensajeIngles(this);
		
		setBounds(100, 100, 806, 528);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAlumnoIngles.class.getResource("/images/icono.png")));
		setContentPane(profesor);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(profesor, nombreVistaMensajeProfesor);
		contentPane.add(nuevoMensaje,nombreVistaNuevoMensaje);
		contentPane.add(alumno,nombreVistaMensajeAlumno);
		contentPane.add(leerMensaje, nombreVistaLeerMensaje);
		
		setTitle("Virtual Notebook");
		
		}
	
	
	public void cambiaContenedor (JPanel e){
		this.setContentPane(e);
		this.setVisible(true);
	}


	
}
