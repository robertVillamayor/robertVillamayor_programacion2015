package VistaIngles;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import modelo.DatosUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaInicialIngles extends JPanel {

	
	private JPasswordField logContrase�a;
	private JTextField logUsuario;
	private JLabel logo, usuario, contrase�a, fondoppal, seleccionaIdioma;
	private JButton validaUser;
	private JRadioButton userProf, userAlum,espa�ol,ingles;
	private ButtonGroup grupo1,grupo2;
	/**
	 * Create the panel.
	 */
	public VistaInicialIngles (Vista.FramePrincipal Frame1) {
		//generaci�n y configuraci�n ventana
		
		/*Icono y nombre en la ventana*/
		
		
		
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		
		setBounds(100, 100, 1000, 600);
		
		//generamos contenedor
		
		setToolTipText("Espa\u00F1ol");
		setForeground(new Color(0, 0, 0));
		setBackground(SystemColor.activeCaption);
		
		setLayout(null);
		
		
		/*configuraci�n elementos del contenedor*/
		logo = new JLabel("");
		logo.setIcon(new ImageIcon(VistaInicialIngles.class.getResource("/images/logo.png")));
		logo.setBounds(44, 31, 520, 284);
		add(logo);
		
		usuario = new JLabel("User");
		usuario.setForeground(new Color(255, 75, 43));
		usuario.setFont(new Font("Segoe Print", usuario.getFont().getStyle() | Font.BOLD, 20));
		usuario.setBounds(147, 328, 79, 27);
		add(usuario);
		
		logUsuario = new JTextField();
		logUsuario.setForeground(Color.BLACK);
		logUsuario.setBackground(UIManager.getColor("Button.background"));
		logUsuario.setToolTipText("");
		logUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		logUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		logUsuario.setBounds(243, 328, 200, 27);
		add(logUsuario);
		
		
		contrase�a = new JLabel("Password");
		contrase�a.setForeground(new Color(255, 75, 43));
		contrase�a.setFont(new Font("Segoe Print", contrase�a.getFont().getStyle() | Font.BOLD, 20));
		contrase�a.setBounds(110, 368, 120, 27);
		add(contrase�a);
		
		logContrase�a = new JPasswordField();
		logContrase�a.setHorizontalAlignment(SwingConstants.CENTER);
		logContrase�a.setBackground(UIManager.getColor("Button.background"));
		logContrase�a.setBounds(243, 368, 200, 27);
		add(logContrase�a);
		
		validaUser = new JButton("Validate");
		validaUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(userAlum.isSelected()){
					DatosUsuario datos =new DatosUsuario(logUsuario.getText(),logContrase�a.getText(),"alumno");
					if(datos.getConectado()){
						Frame1.cambiaPanelAlumnoIngles();
					}
				}else if(userProf.isSelected()){
					DatosUsuario datos =new DatosUsuario(logUsuario.getText(),logContrase�a.getText(),"profesor");
					if(datos.getConectado()){
						Frame1.cambiaPanelProfesorIngles();
					}
				}else{
						
				}
				
			}
			
		});
		validaUser.setIcon(null);
		validaUser.setForeground(new Color(0, 102, 153));
		validaUser.setFont(new Font("Segoe Print", validaUser.getFont().getStyle() | Font.BOLD, 18));
		validaUser.setBackground(UIManager.getColor("Button.light"));
		validaUser.setBounds(315, 464, 134, 23);
		add(validaUser);
		
		// creamos los dos radiobuttons y los agrupamos en grupo1
		
		userProf = new JRadioButton("Teacher");
		userProf.setForeground(new Color(255, 75, 43));
		userProf.setFont(new Font("Segoe Print", userProf.getFont().getStyle() | Font.BOLD, 18));
		userProf.setOpaque(false);
		userProf.setBackground(SystemColor.activeCaption);
		userProf.setBounds(243, 417, 100, 23);
		add(userProf);
		
		userAlum = new JRadioButton("Student");
		userAlum.setForeground(new Color(255, 75, 43));
		userAlum.setFont(new Font("Segoe Print", userAlum.getFont().getStyle() | Font.BOLD, 18));
		userAlum.setOpaque(false);
		userAlum.setBackground(SystemColor.activeCaption);
		userAlum.setBounds(354, 417, 105, 23);
		add(userAlum);
		grupo1 = new ButtonGroup();
		grupo1.add(userAlum);
		grupo1.add(userProf);
		
		seleccionaIdioma = new JLabel("Choose your language :");
		seleccionaIdioma.setForeground(Color.BLACK);
		seleccionaIdioma.setFont(new Font("Arial", Font.BOLD, 15));
		seleccionaIdioma.setBounds(832, 33, 168, 27);
		add(seleccionaIdioma);
		
		espa�ol = new JRadioButton("Spanish");
	    espa�ol.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		Frame1.cambiaPanelInicial2();
	    		Frame1.setTitle("Agenda Virtual");
	    	}
	    });
	    espa�ol.setBackground(SystemColor.activeCaptionBorder);
	    espa�ol.setOpaque(false);
		espa�ol.setBounds(832, 67, 109, 23);
		add(espa�ol);
		
		ingles = new JRadioButton("English");
		ingles.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Frame1.cambiaPanelIncial();
				Frame1.setTitle("Virtual Notebook");
			}
		});
	    ingles.setBackground(SystemColor.activeCaptionBorder);
	    ingles.setOpaque(false);
		ingles.setBounds(832, 107, 109, 23);
		add(ingles);
		grupo2 = new ButtonGroup();
		grupo2.add(espa�ol);
		grupo2.add(ingles);
		
		
		fondoppal = new JLabel("");
		fondoppal.setIcon(new ImageIcon(VistaInicialIngles.class.getResource("/images/FONDO VISTAS.png")));
		fondoppal.setBounds(0, 0, 1000, 600);
		add( fondoppal);
		

	}
}
