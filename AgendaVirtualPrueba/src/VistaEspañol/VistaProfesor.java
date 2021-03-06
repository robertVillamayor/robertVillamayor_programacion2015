package VistaEspaņol;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import widgets.VistaCalendario;

public class VistaProfesor extends JPanel {
	
	private JLabel fotoProf, etipProf, nomProf, etiqConf, fondo ;
	private JButton configuracion, bTarea, bCalificaciones, bMensajes, bEvento ;
	private VistaCalendario calendario;
	private frameMediano mediano;
	private VistaEventos eventos;
	private VistaTareas tareas;
	private VistaMensajeProfesor mensajeProf;
	private VistaNuevoMensaje vistanuevomensaje;
	private VistaCalificaciones calif;

	

	public VistaProfesor() {
		
		calif=new VistaCalificaciones(mediano);
		vistanuevomensaje = new VistaNuevoMensaje(mediano);
		mensajeProf=new VistaMensajeProfesor(mediano);
		tareas=new VistaTareas(mediano);
		mediano=new frameMediano();
		eventos=new VistaEventos(mediano);
		setBounds(100, 100, 994, 572);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		fotoProf = new JLabel("");
		fotoProf.setIcon(new ImageIcon("C:\\Users\\Silvia\\Desktop\\PI\\profesor.png"));
		fotoProf.setBounds(25, 28, 84, 92);
		add(fotoProf);
		
		etipProf = new JLabel("Profesor:");
		etipProf.setFont(new Font("Segoe Print", etipProf.getFont().getStyle() | Font.BOLD, 18));
		etipProf.setBounds(117, 38, 91, 23);
		add(etipProf);
		
		nomProf = new JLabel("Profesor Frink");
		nomProf.setFont(new Font("Segoe Print", nomProf.getFont().getStyle() | Font.BOLD, 18));
		nomProf.setBounds(208, 36, 135, 26);
		add(nomProf);
		
				//Elementos contenedor: etiqueta y boton de configuracion
		
		configuracion = new JButton("");
		configuracion.setIcon(null);
		configuracion.setBounds(134, 86, 26, 26);
		add(configuracion);
		
		etiqConf = new JLabel("Configuraci\u00F3n");
		etiqConf.setFont(new Font("Segoe Print", etiqConf.getFont().getStyle() | Font.BOLD, 18));
		etiqConf.setBounds(170, 87, 124, 25);
		add(etiqConf);
		
				//Elementos contenedor: Botones tareas, calificaciones, evento  y mensajes
		
		bTarea = new JButton("Tarea");
		//accion del boton tareas, que abrira la vista mediana
		bTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mediano.cambiaContenedor(tareas);
			}
		});
		bTarea.setForeground(Color.BLUE);
		bTarea.setFont(new Font("Segoe Print", bTarea.getFont().getStyle() | Font.BOLD, 18));
		bTarea.setIcon(null);
		bTarea.setBounds(507, 98, 165, 35);
		add(bTarea);
		
		bCalificaciones = new JButton("Calificaciones");
		//accion del boton calificaciones, que abrira la vista mediana
		bCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mediano.cambiaContenedor(calif);
			}
		});

		bCalificaciones.setForeground(Color.BLUE);
		bCalificaciones.setFont(new Font("Segoe Print", bCalificaciones.getFont().getStyle() | Font.BOLD, 18));
		bCalificaciones.setBounds(728, 39, 165, 35);
		add(bCalificaciones);
		
		bMensajes = new JButton("Mensajes");
		//accion del boton mensajes, que abrira la vista mediana
		bMensajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mediano.cambiaContenedor(mensajeProf);
				}
		});
					mensajeProf.botonNuevoMensaje.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							mediano.cambiaContenedor(vistanuevomensaje);
							}
					});	
					vistanuevomensaje.botonCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							mediano.cambiaContenedor(mensajeProf);
						}
					});
		bMensajes.setForeground(Color.BLUE);
		bMensajes.setFont(new Font("Segoe Print", bMensajes.getFont().getStyle() | Font.BOLD, 18));
		bMensajes.setBounds(728, 98, 165, 35);
		add(bMensajes);
		
		bEvento = new JButton("Evento");
		//accion del boton eventos, que abrira la vista mediana
		bEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mediano.cambiaContenedor(eventos);
				
			}
		});
		bEvento.setForeground(Color.BLUE);
		bEvento.setFont(new Font("Segoe Print", bEvento.getFont().getStyle() | Font.BOLD, 18));
		bEvento.setBounds(507, 39, 165, 35);
		add(bEvento);
		
		//aņadimos calendario
		
		calendario= new VistaCalendario();
		calendario.setBounds(100,137,800,398);
		calendario.setOpaque(false);
		add(calendario);
		
				//fondo 
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(VistaProfesor.class.getResource("/images/FONDO VISTAS3.png")));
		fondo.setBounds(0, 0, 994, 572);
		add(fondo);

}
}
