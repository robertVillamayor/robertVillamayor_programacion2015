package VistaEspañol;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaLeerMensaje extends JPanel {
	
	private frameMediano vistamediana;
	private JTextField textProfesor, textClase, textCurso, textAsunto;
	private JLabel labelProfesor, labelClase, labelCurso, labelAsunto, fondo;
	public JButton botonAtras;
	private JTextArea textAreaMensaje;
	
	/**
	 * Create the panel.
	 */
	public VistaLeerMensaje(frameMediano vistamediana) {
		setLayout(null);
		
		this.vistamediana = vistamediana;

		labelProfesor = new JLabel("Profesor:");
		labelProfesor.setBounds(33, 51, 54, 14);
		add(labelProfesor);
		
		labelClase = new JLabel("Clase:");
		labelClase.setBounds(366, 51, 36, 14);
		add(labelClase);
		
		labelCurso = new JLabel("Curso:");
		labelCurso.setBounds(560, 51, 48, 14);
		add(labelCurso);
		
		labelAsunto = new JLabel("Asunto:");
		labelAsunto.setBounds(33, 112, 46, 14);
		add(labelAsunto);
		
		textProfesor = new JTextField();
		textProfesor.setEditable(false);
		textProfesor.setBounds(97, 48, 259, 20);
		add(textProfesor);
		textProfesor.setColumns(10);
		
		textClase = new JTextField();
		textClase.setEditable(false);
		textClase.setBounds(412, 48, 138, 20);
		add(textClase);
		textClase.setColumns(10);

		textCurso = new JTextField();
		textCurso.setEditable(false);
		textCurso.setBounds(618, 48, 109, 20);
		add(textCurso);
		textCurso.setColumns(10);

		textAsunto = new JTextField();
		textAsunto.setEditable(false);
		textAsunto.setBounds(97, 109, 238, 20);
		add(textAsunto);
		textAsunto.setColumns(10);
		
		textAreaMensaje = new JTextArea();
		textAreaMensaje.setEditable(false);
		textAreaMensaje.setBounds(97, 162, 654, 251);
		add(textAreaMensaje);
		
		botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBounds(662, 445, 89, 23);
		add(botonAtras);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(VistaLeerMensaje.class.getResource("/images/FONDO VISTAS5.png")));
		fondo.setBounds(0, 0, 800, 500);
		add(fondo);
		
		

	}
}
