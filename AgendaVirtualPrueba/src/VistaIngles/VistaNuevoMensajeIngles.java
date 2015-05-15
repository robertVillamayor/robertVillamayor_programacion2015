package VistaIngles;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaNuevoMensajeIngles extends JPanel {

	//TAMAÑO JPANEL 800X500
	private JComboBox comboBoxCurso, comboBoxClase, comboBoxAlumnos;
	private JTextField jtextAsunto;
	private JLabel labelAsunto, fondo;
	private JTextArea escribirMensaje;
	private JButton botonEnviar;
	public JButton botonCancelar;  
	private FrameMedianoIngles vistamediana;
	
	/**
	 * Create the panel.
	 */
	public VistaNuevoMensajeIngles(FrameMedianoIngles vistamediana) {
		setLayout(null);
		this.vistamediana = vistamediana;
		
		
		comboBoxCurso = new JComboBox();
		comboBoxCurso.setToolTipText("Courses");
		comboBoxCurso.setBounds(45, 44, 102, 20);
		add(comboBoxCurso);
		
		comboBoxClase = new JComboBox();
		comboBoxClase.setToolTipText("Class");
		comboBoxClase.setBounds(267, 44, 102, 20);
		add(comboBoxClase);
		
		comboBoxAlumnos = new JComboBox();
		comboBoxAlumnos.setToolTipText("Students");
		comboBoxAlumnos.setBounds(496, 44, 102, 20);
		add(comboBoxAlumnos);
		
		jtextAsunto = new JTextField();
		jtextAsunto.setBounds(106, 110, 492, 20);
		add(jtextAsunto);
		jtextAsunto.setColumns(10);
		
		labelAsunto = new JLabel("Business:");
		labelAsunto.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelAsunto.setBounds(28, 113, 68, 14);
		add(labelAsunto);
		
		escribirMensaje = new JTextArea();
		escribirMensaje.setBounds(28, 143, 570, 312);
		add(escribirMensaje);
		
		botonEnviar = new JButton("Send");
		botonEnviar.setBounds(651, 432, 89, 23);
		add(botonEnviar);
		
		botonCancelar = new JButton("Cancel");
		botonCancelar.setBounds(651, 380, 89, 23);
		add(botonCancelar);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(VistaNuevoMensajeIngles.class.getResource("/images/FONDO VISTAS5.png")));
		fondo.setBounds(0, 0, 800, 500);
		add(fondo);
		
		

	}
}

