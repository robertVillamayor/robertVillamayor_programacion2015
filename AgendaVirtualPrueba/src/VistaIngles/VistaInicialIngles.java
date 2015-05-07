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

	
	private JPasswordField logContraseña;
	private JTextField logUsuario;
	private JLabel logo, usuario, contraseña, fondoppal, seleccionaIdioma;
	private JComboBox selecIdioma;
	private JButton validaUser;
	private JRadioButton userProf, userAlum;
	private ButtonGroup grupo1;
	/**
	 * Create the panel.
	 */
	public VistaInicialIngles (VistaEspañol.FramePrincipal Frame1) {
		//generación y configuración ventana
		
		/*Icono y nombre en la ventana*/
		
		
		
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		
		setBounds(100, 100, 1000, 600);
		
		//generamos contenedor
		
		setToolTipText("Espa\u00F1ol");
		setForeground(new Color(0, 0, 0));
		setBackground(SystemColor.activeCaption);
		
		setLayout(null);
		
		
		/*configuración elementos del contenedor*/
		logo = new JLabel("");
		logo.setIcon(new ImageIcon(VistaInicialIngles.class.getResource("/images/logo.png")));
		logo.setBounds(44, 31, 520, 284);
		add(logo);
		
		selecIdioma = new JComboBox();
		/*selecIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=selecIdioma.getSelectedItem().toString();
				if(a=="English"){
					Frame1.cambiaPanelIncial();
				
				}
			}
		});*/
		selecIdioma.setForeground(new Color(0, 102, 153));
		selecIdioma.setFont(new Font("Segoe Print", selecIdioma.getFont().getStyle() | Font.BOLD, 18));
		selecIdioma.setBounds(842, 71, 120, 27);
		selecIdioma.addItem("Spanish");
		selecIdioma.addItem("English");
		add(selecIdioma);
		
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
		
		
		contraseña = new JLabel("Password");
		contraseña.setForeground(new Color(255, 75, 43));
		contraseña.setFont(new Font("Segoe Print", contraseña.getFont().getStyle() | Font.BOLD, 20));
		contraseña.setBounds(110, 368, 120, 27);
		add(contraseña);
		
		logContraseña = new JPasswordField();
		logContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		logContraseña.setBackground(UIManager.getColor("Button.background"));
		logContraseña.setBounds(243, 368, 200, 27);
		add(logContraseña);
		
		validaUser = new JButton("Validate");
		validaUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(userAlum.isSelected()){
					DatosUsuario datos =new DatosUsuario(logUsuario.getText(),logContraseña.getText(),"alumno");
					if(datos.getConectado()){
						Frame1.cambiaPanelAlumno();
					}
				}else if(userProf.isSelected()){
					DatosUsuario datos =new DatosUsuario(logUsuario.getText(),logContraseña.getText(),"profesor");
					if(datos.getConectado()){
						Frame1.cambiaPanelProfesor();
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
		
		seleccionaIdioma = new JLabel("Selecciona un idioma :");
		seleccionaIdioma.setForeground(Color.BLACK);
		seleccionaIdioma.setFont(new Font("Arial", Font.BOLD, 15));
		seleccionaIdioma.setBounds(832, 33, 168, 27);
		add(seleccionaIdioma);
		
		
		fondoppal = new JLabel("");
		fondoppal.setIcon(new ImageIcon(VistaInicialIngles.class.getResource("/images/FONDO VISTAS.png")));
		fondoppal.setBounds(0, 0, 1000, 600);
		add( fondoppal);
		

	}
}
