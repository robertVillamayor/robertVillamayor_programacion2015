package VistaEspañol;

import javax.swing.JPanel;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import widgets.VistaCalendario;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaAlumno extends JPanel {

	private JLabel foto, etiqAlum , nomAlum ,etiqConf, fondoAlum;
	private JButton configuracion, bcalif, bMensajes ;
	private VistaCalendario calendario;
	private VistaPeq peque;
	private frameMediano medi;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the panel.
	 */
	
	public VistaAlumno() {
		
		medi=new frameMediano();
		
		//Configuración contenedor
		
		setLayout(null);
		
				//Elementos contenedor: foto,tipo usuario y nombre
		
		foto = new JLabel("");
		foto.setIcon(new ImageIcon(VistaAlumno.class.getResource("/images/alumno.png")));
		foto.setBounds(25, 28, 84, 92);
		add(foto);
		
		etiqAlum = new JLabel("Alumno:");
		etiqAlum.setFont(new Font("Segoe Print", etiqAlum.getFont().getStyle() | Font.BOLD, 18));
		etiqAlum.setBounds(119, 39, 84, 14);
		add(etiqAlum);
		
		nomAlum = new JLabel("Pablo Magaña");
		nomAlum.setFont(new Font("Segoe Print", nomAlum.getFont().getStyle() | Font.BOLD, 18));
		nomAlum.setBounds(199, 32, 152, 28);
		add(nomAlum);
		
				//Elementos contenedor: etiqueta y boton de configuracion
		
		etiqConf = new JLabel("Configuración");
		etiqConf.setFont(new Font("Segoe Print", etiqConf.getFont().getStyle() | Font.BOLD, 18));
		etiqConf.setBounds(161, 61, 135, 28);
		add(etiqConf); 
		
		configuracion = new JButton("");
		configuracion.setForeground(SystemColor.activeCaption);
		configuracion.setIcon(null);
		configuracion.setBounds(125, 63, 26, 26);
		add(configuracion);
		
			//Elementos contenedor: Botones calificaciones y mensajes
		
		bcalif = new JButton("Calificaciones");
		bcalif.setFont(new Font("Segoe Print", bcalif.getFont().getStyle() | Font.BOLD, 16));
		bcalif.setForeground(Color.BLUE);
		bcalif.setIcon(null);
		bcalif.setBounds(832, 43, 152, 33);
		add(bcalif);
		
		bMensajes = new JButton("Mensajes");
		//asigna accion al boton para que abra la vista pequeña (contraseña padres)
		bMensajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pass) {
				peque= new VistaPeq(medi);
				peque.setVisible (true);
				
				
			}
		});
		bMensajes.setFont(new Font("Segoe Print", bMensajes.getFont().getStyle() | Font.BOLD, 16));
		bMensajes.setForeground(Color.BLUE);
		bMensajes.setIcon(null);
		bMensajes.setBounds(832, 87, 152, 33);
		add(bMensajes);
		
		//añadimos calendario
		
				calendario= new VistaCalendario();
				calendario.setBounds(100,131,800,398);
				calendario.setOpaque(false);
				this.add(calendario);
		
		//fondo pantalla
		fondoAlum = new JLabel("");
		fondoAlum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fondoAlum.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		fondoAlum.setHorizontalAlignment(SwingConstants.CENTER);
		fondoAlum.setIcon(new ImageIcon(VistaAlumno.class.getResource("/images/FONDO VISTAS3.png")));
		fondoAlum.setBounds(0, 0, 994, 563);
		add(fondoAlum);
	}
}
