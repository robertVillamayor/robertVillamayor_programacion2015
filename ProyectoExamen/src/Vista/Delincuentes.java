package Vista;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import Modelo.ModeloDelincuentes;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delincuentes extends JPanel {
	
	private JTextField cajaNombre,cajaEdad,cajaSexo,cajaNacionalidad,cajaDireccion,cajaPoblacion;
	private JComboBox comboBox;
	private JButton botonAntecedentes;
	private JLabel lblSexo,lblEdad,lblDireccion,lblNacionalidad,lblNombre,lblPoblacion,lblNewLabel;
	
	private Principal principal;
	private VistaApp vista;
	private Antecedentes antecedentes;
	
	private ModeloDelincuentes delincuentes;
	
	

	public Delincuentes() {
		
		delincuentes=new ModeloDelincuentes();
		
		setLayout(null);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(238, 67, 35, 14);
		add(lblEdad);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(238, 175, 178, 14);
		add(lblDireccion);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(238, 123, 178, 14);
		add(lblNacionalidad);
		
		lblPoblacion = new JLabel("Poblacion");
		lblPoblacion.setBounds(238, 228, 178, 14);
		add(lblPoblacion);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(238, 11, 178, 14);
		add(lblNombre);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(357, 67, 42, 14);
		add(lblSexo);
		
		cajaNombre = new JTextField();
		cajaNombre.setBounds(238, 36, 191, 20);
		add(cajaNombre);
		cajaNombre.setColumns(10);
		
		cajaEdad = new JTextField();
		cajaEdad.setBounds(236, 92, 59, 20);
		add(cajaEdad);
		cajaEdad.setColumns(10);
		
		cajaSexo = new JTextField();
		cajaSexo.setColumns(10);
		cajaSexo.setBounds(357, 92, 59, 20);
		add(cajaSexo);
		
		cajaNacionalidad = new JTextField();
		cajaNacionalidad.setColumns(10);
		cajaNacionalidad.setBounds(238, 148, 191, 20);
		add(cajaNacionalidad);
		
		cajaDireccion = new JTextField();
		cajaDireccion.setColumns(10);
		cajaDireccion.setBounds(238, 197, 191, 20);
		add(cajaDireccion);
		
		cajaPoblacion = new JTextField();
		cajaPoblacion.setColumns(10);
		cajaPoblacion.setBounds(238, 253, 191, 20);
		add(cajaPoblacion);
		
		botonAntecedentes = new JButton("Antecedentes >>");
		botonAntecedentes.setBounds(238, 292, 191, 23);
		add(botonAntecedentes);
		
		lblNewLabel = new JLabel("Delincuentes");
		lblNewLabel.setBounds(45, 23, 110, 14);
		add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.addItem(delincuentes.getNombres());
		/*comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String delincuentes=comboBox.getSelectedItem().toString();
				if(delincuentes=="David Alós"){
					cajaNombre.setText();
				}
			}
		});*/
		comboBox.setBounds(27, 50, 110, 20);
		add(comboBox);
		
		

	}

	public JButton getBotonAntecedentes() {
		return botonAntecedentes;
	}
}
