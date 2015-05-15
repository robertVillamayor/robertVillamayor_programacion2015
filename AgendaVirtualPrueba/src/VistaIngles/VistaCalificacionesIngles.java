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

public class VistaCalificacionesIngles extends JPanel {
	private JLabel fondo,lblCalificaciones;
	private FrameMedianoIngles medi;
	
	/**
	 * Create the panel.
	 */
	public VistaCalificacionesIngles(FrameMedianoIngles medi) {

		this.medi=medi;
		setForeground(SystemColor.activeCaption);
		setBackground(SystemColor.activeCaption);
		setBorder(null);
		setLayout(null);
				
				//fondo ventana
			
				
				lblCalificaciones = new JLabel("QUALIFICATIONS");
				lblCalificaciones.setFont(new Font("Tahoma", Font.BOLD, 64));
				lblCalificaciones.setBackground(Color.BLACK);
				lblCalificaciones.setBounds(52, 99, 637, 331);
				add(lblCalificaciones);
				
				fondo = new JLabel("");
				fondo.setIcon(new ImageIcon(VistaCalificacionesIngles.class.getResource("/images/FONDO VISTAS5.png")));
				fondo.setBounds(0, 0, 800, 500);
				add(fondo);
	}
}
