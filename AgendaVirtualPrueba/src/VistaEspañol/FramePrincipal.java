package VistaEspañol;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class FramePrincipal extends JFrame {

	private VistaAlumno alumno;
	private VistaInicial inicial;
	private VistaProfesor profesor;
	private VistaIngles.VistaAlumnoIngles alumnoIngles;
	private VistaIngles.VistaInicialIngles inicialIngles;
	private VistaIngles.VistaProfesorIngles profesorIngles;
	

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		
		alumno= new VistaAlumno();
		inicial= new VistaInicial(this);
		profesor= new VistaProfesor();
		alumnoIngles= new  VistaIngles.VistaAlumnoIngles();
		inicialIngles= new  VistaIngles.VistaInicialIngles(this);
		profesorIngles= new VistaIngles.VistaProfesorIngles();
	
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAlumno.class.getResource("/images/icono.png")));
		setTitle("Agenda Virtual");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1000, 600);
		setContentPane(inicialIngles);
	}
	
	public void cambiaPanelAlumno(){
		this.setContentPane(alumno);
		this.setVisible(true);
	}
	public void cambiaPanelProfesor(){
		this.remove(inicial);
		setContentPane(profesor);
		this.setVisible(true);
	}
	public void cambiaPanelIncial(){
		this.setVisible(false);
		setContentPane(inicialIngles);
		this.setVisible(true);
	}

}
