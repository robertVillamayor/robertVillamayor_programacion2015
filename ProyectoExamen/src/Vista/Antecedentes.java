package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.ModeloDelincuentes;

public class Antecedentes extends JPanel {

	private JTextField caja ;
	private JLabel lblNewLabel ;
	private JButton btnSalvar ;	
	
	


	public Antecedentes() {
		
		setLayout(null);
		
		caja = new JTextField();
		caja.setBounds(24, 67, 400, 193);
		add(caja);
		
		lblNewLabel = new JLabel("Antecedentes");
		lblNewLabel.setBounds(24, 32, 139, 14);
		add(lblNewLabel);
		
		btnSalvar = new JButton("Salvar >>");
		btnSalvar.setBounds(24, 285, 89, 23);
		add(btnSalvar);
		
		
	}
	public JTextField getCaja() {
		return caja;
	}
}
