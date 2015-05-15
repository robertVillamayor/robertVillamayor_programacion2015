package VistaEspañol;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VistaMensajeProfesor extends JPanel{

	public static frameMediano vistamediana;
	//public static VistaNuevoMensaje vistanuevomensaje;
	//TAMAÑO JPANEL 800X500
	public JButton botonNuevoMensaje;
	
	//LABELS ASUNTO, DESTINATARIO, FECHA Y FONDO. ESTOS NO SE PUEDEN AUTOMATIZAR YA QUE LA INFORMACION
	//SIEMPRE SERÁ LA MISMA Y NO CAMBIARÁ
	private JLabel labelDestinatario0, labelAsunto0, labelFecha0, fondo;
	
	//ARRAYS PARA CREAR LOS LABELS DE ASUNTO, DESTINATARIO Y FECHA
	public JLabel[] labelDestinatario = new JLabel[15];
	public JLabel[] labelAsunto = new JLabel[labelDestinatario.length];
	public JLabel[] labelFecha = new JLabel[labelDestinatario.length];
	public JLabel[] imagenBotonBorrar = new JLabel[labelDestinatario.length];

	//METODOS PARA CREAR LABELS AUTOMATICAMENTE
	private void crearLabelsDestinatario(){
		int Y=134;
        for (int i=0;i<labelDestinatario.length;i++){
            labelDestinatario[i] = new JLabel("hola");
    		labelDestinatario[i].setFont(new Font("Rockwell", Font.PLAIN, 15));
            labelDestinatario[i].setBounds(69, Y, 100, 14);
    		add(labelDestinatario[i]);
    		Y=Y+20;
        }
    }
	
	private void crearLabelsAsunto(){
		int Y=134;
        for (int i=0;i<labelAsunto.length;i++){
        	labelAsunto[i] = new JLabel("como");
    		labelAsunto[i].setFont(new Font("Rockwell", Font.PLAIN, 15));
        	labelAsunto[i].setBounds(354, Y, 100, 14);
    		add(labelAsunto[i]);
    		Y=Y+20;
        }
    }
	
	private void crearLabelsFecha(){
		int Y=134;
        for (int i=0;i<labelFecha.length;i++){
        	labelFecha[i] = new JLabel("estas");
    		labelFecha[i].setFont(new Font("Rockwell", Font.PLAIN, 15));
        	labelFecha[i].setBounds(593, Y, 100, 14);
    		add(labelFecha[i]);
    		Y=Y+20;
        }
    }
	
	//MÉTODO PARA CREAR LAS IMÁGENES DEL BOTÓN
	private void crearImagenBotonBorrar(){
		int Y=126;
		for (int i=0;i<imagenBotonBorrar.length;i++){
			imagenBotonBorrar[i] = new JLabel("");
			imagenBotonBorrar[i].setIcon(new ImageIcon(VistaMensajeProfesor.class.getResource("/images/Borrar.png")));
			imagenBotonBorrar[i].setBounds(744, Y, 30, 31);
			add(imagenBotonBorrar[i]);
			Y=Y+20;
		}
	}
	/**
	 * Create the panel.
	 */
	public VistaMensajeProfesor(frameMediano vistaMediana) {
		setLayout(null);
		
		
		
		this.vistamediana=vistamediana;
		//this.vistanuevomensaje = vistanuevomensaje;
		
		crearLabelsDestinatario();
		crearLabelsAsunto();
		crearLabelsFecha();
		crearImagenBotonBorrar();

		labelDestinatario0 = new JLabel("Destinatario");
		labelDestinatario0.setFont(new Font("Segoe Print", Font.BOLD, 19));
		labelDestinatario0.setBounds(68, 97, 128, 31);
		add(labelDestinatario0);
		
		labelAsunto0 = new JLabel("Asunto");
		labelAsunto0.setFont(new Font("Segoe Print", Font.BOLD, 19));
		labelAsunto0.setBounds(354, 97, 94, 31);
		add(labelAsunto0);
		
		labelFecha0 = new JLabel("Fecha Envio");
		labelFecha0.setFont(new Font("Segoe Print", Font.BOLD, 19));
		labelFecha0.setBounds(593, 97, 128, 31);
		add(labelFecha0);
		
		botonNuevoMensaje = new JButton("Nuevo Mensaje");
		botonNuevoMensaje.setBounds(593, 32, 169, 23);
		add(botonNuevoMensaje);

		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(VistaMensajeProfesor.class.getResource("/images/FONDO VISTAS5.png")));
		fondo.setBounds(0, 0, 800, 500);
		add(fondo);
		
	
		
	}
	
}
