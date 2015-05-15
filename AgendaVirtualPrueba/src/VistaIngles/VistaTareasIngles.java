package VistaIngles;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.ImageIcon;

public class VistaTareasIngles extends JPanel {

	
	private JComboBox curso, clase,  asignatura,  tipo, alumnos; 
	private JDateChooser eligeDia;
	private JTextArea asuntoTarea;
	private JLabel fondo;
	private JButton bEnviar;
	private JButton bCancelar;
	private FrameMedianoIngles medi;
	
	/**
	 * Create the panel.
	 */
	public VistaTareasIngles(FrameMedianoIngles medi) {
		
		this.medi=medi;
		setForeground(SystemColor.activeCaption);
		setBackground(SystemColor.activeCaption);
		setBorder(null);
		setLayout(null);
		
		//creamos los distintos desplegables y la fecha para seleccionar y enviar la tarea
		
				curso = new JComboBox();
				curso.setFont(new Font("Segoe Print", curso.getFont().getStyle() | Font.BOLD, 18));
				curso.setBounds(43, 35, 125, 27);
				curso.addItem ("Courses");
				curso.setForeground(new Color(0, 102, 153));
				add(curso);
				
				clase = new JComboBox();
				clase.setFont(new Font("Segoe Print", clase.getFont().getStyle() | Font.BOLD, 18));
				clase.setBounds(212, 35, 125, 27);
				clase.addItem ("Class");
				clase.setForeground(new Color(0, 102, 153));
				add(clase);
				
				alumnos = new JComboBox();
				alumnos.setFont(new Font("Segoe Print", alumnos.getFont().getStyle() | Font.BOLD, 18));
				alumnos.setBounds(380, 35, 125, 27);
				alumnos.addItem ("Students");
				alumnos.setForeground(new Color(0, 102, 153));
				add(alumnos);
				
				asignatura = new JComboBox();
				asignatura.setFont(new Font("Segoe Print", asignatura.getFont().getStyle() | Font.BOLD, 15));
				asignatura.setBounds(43, 84, 125, 27);
				asignatura.addItem ("Subjects");
				asignatura.setForeground(new Color(0, 102, 153));
				add(asignatura);
				
				tipo = new JComboBox();
				tipo.setFont(new Font("Segoe Print", tipo.getFont().getStyle() | Font.BOLD, 18));
				tipo.setBounds(212, 84, 125, 27);
				tipo.addItem ("Type");
				tipo.setForeground(new Color(0, 102, 153));
				add(tipo);
				
				eligeDia = new JDateChooser();
				eligeDia.setBounds(380, 84, 125, 27);
				add(eligeDia);
				
				//Creamos un textArea para escribir la tarea
				asuntoTarea = new JTextArea();
				asuntoTarea.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, new Color(0, 0, 255), null, null));
				asuntoTarea.setFont(new Font("Segoe Print", asuntoTarea.getFont().getStyle(), 18));
				asuntoTarea.setLineWrap(true);
				asuntoTarea.setBounds(43, 165, 462, 302);
				add(asuntoTarea);
				
				//Boton para enviar la tarea
				bEnviar = new JButton("Send");
				bEnviar.setFont(new Font("Segoe Print", bEnviar.getFont().getStyle() | Font.BOLD, 20));
				bEnviar.setForeground(new Color(0, 102, 153));
				bEnviar.setBounds(515, 440, 125, 27);
				add(bEnviar);
				
				bCancelar = new JButton("Cancel");
				bCancelar.setFont(new Font("Segoe Print", bCancelar.getFont().getStyle() | Font.BOLD, 20));
				bCancelar.setForeground(new Color(0, 102, 153));
				bCancelar.setBounds(650, 440, 125, 27);
				add(bCancelar);
				
				//fondo ventana
				fondo = new JLabel("");
				fondo.setIcon(new ImageIcon(VistaTareasIngles.class.getResource("/images/FONDO VISTAS.png")));
				fondo.setBounds(0, 0, 800, 500);
				add(fondo);
	}

}
