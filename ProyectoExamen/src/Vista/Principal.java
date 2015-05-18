package Vista;

import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.ModeloUsuarios;

public class Principal extends JPanel {
	
	private JTextField cajaContraseña;
	private JComboBox comboBox;
	private JButton botonLogin,botonLogout;
	private JLabel lblUsuario,lblContrasea; 
	private ModeloUsuarios u;


	
	public Principal() {
		
		u=new ModeloUsuarios();

		
		setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(28, 71, 153, 20);
		add(comboBox);
		
		/*Iterator <Object> it = u.getPass().iterator();
		while(it.hasNext()){
			comboBox.addItem((Object)it.next());
		}*/
		
		cajaContraseña = new JTextField();
		cajaContraseña.setBounds(28, 139, 153, 20);
		add(cajaContraseña);
		cajaContraseña.setColumns(10);
		
		botonLogin = new JButton("LogIn");
		botonLogin.setBounds(28, 220, 153, 23);
		add(botonLogin);
		
		botonLogout = new JButton("LogOut");
		botonLogout.setBounds(28, 272, 153, 23);
		add(botonLogout);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(30, 46, 67, 14);
		add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(28, 118, 109, 14);
		add(lblContrasea);

	}
}
