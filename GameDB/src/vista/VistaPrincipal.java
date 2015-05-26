package vista;

import java.sql.Connection;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.UsuariosModelo;

public class VistaPrincipal extends JPanel {
	
	//DECLARAMOS LAS VARIABLES
	private JLabel foto, lblPlataforma,lblGenero,lblNombre,label,lblNewLabel_1,lblNewLabel,lblFiltros;
	private ImageIcon imagen;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4;
	private JButton btnJuegos,btnPerfil,btnLogin,btnRegistrar,btnEditar,btnSalvar;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JList jlist;
	private JComboBox comboBox_1,comboBox_2; 
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private UsuariosModelo u;
	
	//EN EL CONSTRUCTOR DE LA CLASE DISEÑAMOS EL CONTENEDOR CON LOS COMPONENTES
	public VistaPrincipal() {
		
		u=new UsuariosModelo();
		
		imagen=new ImageIcon(VistaPrincipal.class.getResource("/Imagenes/foto.jpg.png"));
		setLayout(null);
		
		foto = new JLabel("New label");
		foto.setBounds(22, 21, 155, 147);
		foto.setIcon(imagen);
		add(foto);
		
		btnJuegos = new JButton("Juegos   >>");
		btnJuegos.setBounds(234, 34, 172, 23);
		add(btnJuegos);
		
		btnPerfil = new JButton("Perfil  >>");
		btnPerfil.setBounds(234, 83, 172, 23);
		add(btnPerfil);
		
		comboBox = new JComboBox();
		comboBox.setBounds(22, 202, 155, 20);
		add(comboBox);
		
		//ACCION QUE ME RELLENA EL COMBOBOX CON LOS DATOS SELECCIONADOS DE LA BASE DE DATOS
		Iterator <String> it = u.getPersonas().iterator();
		while(it.hasNext()){
			comboBox.addItem((String)it.next());
		}
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(22, 285, 155, 23);
		add(btnLogin);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(22, 319, 155, 23);
		add(btnRegistrar);
		
		textField = new JTextField();
		textField.setBounds(22, 254, 155, 20);
		add(textField);
		textField.setColumns(10);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(22, 179, 46, 14);
		add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(22, 233, 88, 14);
		add(lblContrasea);
		
	}

	//GETTER PARA PODER ACCEDER A ESTE BOTON DESDE OTRA CLASE
	public JButton getBtnJuegos() {
		return btnJuegos;
	}





	
	
}
