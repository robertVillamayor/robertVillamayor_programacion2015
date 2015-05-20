package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.ModeloUsuarios;

public class Principal extends JPanel {
	
	private JTextField cajaContraseña;
	private JComboBox comboBox;
	private JButton botonLogin,botonLogout;
	private JLabel lblUsuario,lblContrasea; 
	private ModeloUsuarios usuarios;

	boolean validado=false;
	
	public Principal() {
		
		usuarios=new ModeloUsuarios();

		
		setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(28, 71, 153, 20);
		add(comboBox);
		
		Iterator <Object> it = usuarios.getUsuarios().iterator();
		while(it.hasNext()){
			comboBox.addItem((Object)it.next());
		}
		
		cajaContraseña = new JTextField();
		cajaContraseña.setBounds(28, 139, 153, 20);
		add(cajaContraseña);
		cajaContraseña.setColumns(10);
		
		botonLogin = new JButton("LogIn");
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = comboBox.getSelectedIndex();
				String b = cajaContraseña.getText();
				String contraseña1 = usuarios.getDatos(0,2);
				String contraseña2 = usuarios.getDatos(1, 2);
				if(a==0){
					if(b.compareTo(contraseña1)==0){
						System.out.println("VALIDO");
						botonLogin.setEnabled(false);
						botonLogout.setEnabled(true);
						validado=true;
					}else{
						System.out.println("NO VALIDO");
						Object[] options = { "OK", "CANCEL" };
						JOptionPane.showOptionDialog(null, "Introduce contraseña", "ERROR",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
						null, options, options[0]);
						validado=false;
					}
				}
				
				if(a==1){
					if(b.compareTo(contraseña2)==0){
						System.out.println("VALIDO");
						botonLogin.setEnabled(false);
						botonLogout.setEnabled(true);
						validado=true;
					}else{
						System.out.println("NO VALIDO");
						Object[] options = { "OK", "CANCEL" };
						JOptionPane.showOptionDialog(null, "Introduce contraseña", "ERROR",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
						null, options, options[0]);
						validado=false;
					}
				}
			}
		});
		botonLogin.setBounds(28, 220, 153, 23);
		add(botonLogin);
		
		botonLogout = new JButton("LogOut");
		botonLogout.setEnabled(false);
		botonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cajaContraseña.setText("");
				botonLogin.setEnabled(true);
				botonLogout.setEnabled(false);
				validado=false;
			}
		});
		botonLogout.setBounds(28, 272, 153, 23);
		add(botonLogout);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(30, 46, 67, 14);
		add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(28, 118, 109, 14);
		add(lblContrasea);
		
	}
	
	public boolean estaValidado()
	{
		return this.validado;
	}
}
