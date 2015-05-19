package Vista;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Antecedentes extends JPanel {

	private JTextArea textArea ;
	private JLabel lblNewLabel ;
	private JButton btnSalvar ;	
	


	public Antecedentes() {
		setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(24, 67, 400, 193);
		add(textArea);
		
		lblNewLabel = new JLabel("Antecedentes");
		lblNewLabel.setBounds(24, 32, 139, 14);
		add(lblNewLabel);
		
		btnSalvar = new JButton("Salvar >>");
		btnSalvar.setBounds(24, 285, 89, 23);
		add(btnSalvar);
		
	}
	public JTextArea getTextArea() {
		return textArea;
	}
}
