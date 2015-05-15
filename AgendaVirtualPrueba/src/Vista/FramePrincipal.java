package Vista;

import java.awt.Toolkit;

import javax.swing.JFrame;

import VistaEspañol.VistaAlumno;
import VistaEspañol.VistaInicial;
import VistaEspañol.VistaProfesor;

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
		setContentPane(inicial);
	}
	
	public void cambiaPanelAlumno(){
		this.setContentPane(alumno);
		this.setVisible(true);
	}
	public void cambiaPanelProfesor(){
		setContentPane(profesor);
		this.setVisible(true);
	}
	public void cambiaPanelProfesorIngles(){
		setContentPane(profesorIngles);
		this.setVisible(true);
	}
	public void cambiaPanelAlumnoIngles(){
		setContentPane(alumnoIngles);
		this.setVisible(true);
	}
	public void cambiaPanelIncial(){
		setContentPane(inicialIngles);
		this.setVisible(true);
	}
	public void cambiaPanelInicial2(){
		setContentPane(inicial);
		this.setVisible(true);
	}

}
