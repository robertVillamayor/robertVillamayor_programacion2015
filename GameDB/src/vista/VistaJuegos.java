package vista;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VistaJuegos extends JPanel {
	
	//DECLARAMOS LAS VARIABLES
	private JLabel  lblPlataforma,lblGenero,lblNombre,label,lblNewLabel_1,lblNewLabel,lblFiltros;
	private JTextField textField_1,textField_2,textField_3,textField_4;
	private JButton btnEditar,btnSalvar;
	private JScrollPane scrollPane;
	private JList jlist;
	private JComboBox comboBox_1,comboBox_2; 
	
	//EL CONSTRUCTOR DE LA CLASE DONDE DISEÑAMOS EL CONTENEDOR CON LOS COMPONENTES
	public VistaJuegos() {

		String datos[]={"Juuego1","Juego2","Juego3","Juego4","Juego seleccionado","Juego5","Juego6","Juego seleccionado","Juego de mierda","Juego7","Juego seleccionado"};
		
		setLayout(null);
		
		jlist=new JList(datos);
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlist.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		
		
		scrollPane= new JScrollPane(jlist);
		scrollPane.setBounds(10, 100, 167, 224);
		add(scrollPane);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(244, 100, 70, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(244, 156, 70, 14);
		add(lblGenero);
		
		lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(244, 212, 70, 14);
		add(lblPlataforma);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 125, 176, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(244, 181, 174, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(244, 237, 174, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(244, 273, 110, 20);
		add(btnEditar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(244, 304, 110, 20);
		add(btnSalvar);
		
		lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(10, 11, 46, 14);
		add(lblFiltros);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(43, 36, 46, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(175, 36, 46, 14);
		add(lblNewLabel_1);
		
		label = new JLabel("Plataforma");
		label.setBounds(303, 36, 70, 14);
		add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(43, 54, 110, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Genero"}));
		comboBox_1.setBounds(175, 54, 110, 20);
		add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Plataforma"}));
		comboBox_2.setBounds(303, 54, 103, 20);
		add(comboBox_2);
		
	}

}
