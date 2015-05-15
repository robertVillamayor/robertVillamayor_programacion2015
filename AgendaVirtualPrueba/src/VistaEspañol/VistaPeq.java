package VistaEspañol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPasswordField;

import modelo.DatosUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPeq extends JFrame {

	private JPanel contentPanePeq;
	private JTextField cajaUser;
	private JPasswordField cajaPassword;
	private JLabel fondo, usuario, password;
	private JButton entrar;
	private VistaMensajeAlumno alum;

	

	/**
	 * Create the frame.
	 */
	public VistaPeq(frameMediano med) {
		
		alum=new VistaMensajeAlumno(med);
		
		//Configuracion  ventana
		setTitle("Agenda Virtual");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaPeq.class.getResource("/images/icono.png")));
		
			//Creamos y configuramos el contenedor de la ventana y sus componentes
		setBounds(100, 100, 370, 273);
		contentPanePeq = new JPanel();
		contentPanePeq.setMaximumSize(new Dimension(355, 235));
		contentPanePeq.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanePeq);
		contentPanePeq.setLayout(null);
			
				//etiqueta usuario y su caja, etiqueta password y su caja
		usuario = new JLabel("Usuario");
		usuario.setBounds(48, 82, 101, 29);
		usuario.setForeground(new Color(202, 91, 87));
		usuario.setFont(new Font("Segoe Print", Font.BOLD, 24));
		contentPanePeq.add(usuario);
		
		cajaUser = new JTextField();
		cajaUser.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		cajaUser.setBounds(169, 82, 149, 29);
		cajaUser.setHorizontalAlignment(SwingConstants.CENTER);
		contentPanePeq.add(cajaUser);
		cajaUser.setColumns(10);
		
		password = new JLabel("Contrase\u00F1a");
		password.setForeground(new Color(202, 91, 87));
		password.setFont(new Font("Segoe Print", Font.BOLD, 24));
		password.setBounds(23, 132, 136, 29);
		contentPanePeq.add(password);
		
		cajaPassword = new JPasswordField();
		cajaPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cajaPassword.setHorizontalAlignment(SwingConstants.CENTER);
		cajaPassword.setBounds(169, 137, 149, 29);
		contentPanePeq.add(cajaPassword);
		
				//Boton para login hacia mensajes padres
		entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					DatosUsuario datos =new DatosUsuario(cajaUser.getText(),cajaPassword.getText(),"profesor");
					if(datos.getConectado()){
						med.cambiaContenedor(alum);
						setVisible(false);
				
				
			}
			}
		});
		entrar.setFont(new Font("Segoe Print", Font.BOLD, 18));
		entrar.setForeground(new Color(0, 102, 153));
		entrar.setBounds(217, 190, 95, 28);
		contentPanePeq.add(entrar);
		
				//fondo contenedor
		fondo = new JLabel("");
		fondo.setBounds(0, 0, 355, 235);
		fondo.setIcon(new ImageIcon(VistaPeq.class.getResource("/images/molinillo.png")));
		contentPanePeq.add(fondo);
	}
}
