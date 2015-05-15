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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaEventosIngles extends JPanel {

	
	private JComboBox curso, clase,  asignatura,  tipo; 
	private JDateChooser eligeDia;
	private JTextArea asuntoTarea;
	private JLabel fondo;
	private JButton bEnviar;
	private JButton btnCancelar;
	private FrameMedianoIngles mediano;
	
	/**
	 * Create the panel.
	 */
	public VistaEventosIngles(FrameMedianoIngles mediano) {
		
		mediano=new FrameMedianoIngles();
		setForeground(SystemColor.activeCaption);
		setBackground(SystemColor.activeCaption);
		setBorder(null);
		setLayout(null);
		
		//creamos los distintos desplegables y la fecha para seleccionar y enviar la tarea
		
				curso = new JComboBox();
				curso.setFont(new Font("Segoe Print", curso.getFont().getStyle() | Font.BOLD, 18));
				curso.setBounds(102, 35, 125, 27);
				curso.addItem ("Courses");
				curso.setForeground(new Color(0, 102, 153));
				add(curso);
				
				clase = new JComboBox();
				clase.setFont(new Font("Segoe Print", clase.getFont().getStyle() | Font.BOLD, 18));
				clase.setBounds(284, 35, 125, 27);
				clase.addItem ("Classes");
				clase.setForeground(new Color(0, 102, 153));
				add(clase);
				
				asignatura = new JComboBox();
				asignatura.setFont(new Font("Segoe Print", asignatura.getFont().getStyle() | Font.BOLD, 15));
				asignatura.setBounds(43, 84, 125, 27);
				asignatura.addItem ("Subjects");
				asignatura.setForeground(new Color(0, 102, 153));
				add(asignatura);
				
				tipo = new JComboBox();
				tipo.setFont(new Font("Segoe Print", tipo.getFont().getStyle() | Font.BOLD, 18));
				tipo.setBounds(211, 83, 125, 27);
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
				
				//Boton para cancelar la tarea
				btnCancelar = new JButton("Cancel");
				btnCancelar.setFont(new Font("Segoe Print", btnCancelar.getFont().getStyle() | Font.BOLD, 20));
				btnCancelar.setForeground(new Color(0, 102, 153));
				btnCancelar.setBounds(650, 440, 125, 27);
				add(btnCancelar);
				
				//fondo ventana
				fondo = new JLabel("");
				fondo.setIcon(new ImageIcon(VistaEventosIngles.class.getResource("/images/FONDO VISTAS.png")));
				fondo.setBounds(0, 0, 800, 511);
				add(fondo);
				
			
	}
}

