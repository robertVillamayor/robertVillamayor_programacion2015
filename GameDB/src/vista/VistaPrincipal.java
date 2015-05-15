package vista;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel {
	
	private JPanel principal;
	private JLabel foto;
	private ImageIcon imagen;
	private JTextField textField;
	
	public VistaPrincipal() {
		setLayout(new CardLayout(0, 0));
		
		principal = new JPanel();
		add(principal, "name_4470932519225");
		principal.setLayout(null);
		
		imagen=new ImageIcon(VistaPrincipal.class.getResource("/Imagenes/foto.jpg.png"));
		
		foto = new JLabel("New label");
		foto.setBounds(25, 27, 150, 131);
		foto.setIcon(imagen);
		principal.add(foto);
		
		JButton btnNewButton = new JButton("Juegos   >>");
		btnNewButton.setBounds(278, 27, 171, 23);
		principal.add(btnNewButton);
		
		JButton btnPerfil = new JButton("Perfil  >>");
		btnPerfil.setBounds(278, 61, 171, 23);
		principal.add(btnPerfil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(25, 175, 150, 20);
		principal.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(25, 213, 150, 20);
		principal.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(25, 253, 150, 23);
		principal.add(btnNewButton_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(25, 287, 150, 23);
		principal.add(btnRegistrar);
		
		
	}
}
