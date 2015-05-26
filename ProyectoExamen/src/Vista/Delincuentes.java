package Vista;

import java.awt.Font;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JList;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextField;

import javax.swing.ListSelectionModel;

import Modelo.ModeloDelincuentes;

import javax.swing.event.ListSelectionListener;

import javax.swing.event.ListSelectionEvent;

public class Delincuentes extends JPanel { 

	private JTextField cajaNombre,cajaEdad,cajaSexo,cajaNacionalidad,cajaDireccion,cajaPoblacion; 
	private JButton botonAntecedentes; 
	private ModeloDelincuentes delincuentes; 
	private JList list; 
	private JScrollPane scrollPane; 
	private JLabel lblSexo,lblEdad,lblDireccion,lblNacionalidad,lblNombre,lblPoblacion,lblNewLabel; 

public Delincuentes(VistaApp vista) { 

	delincuentes=new ModeloDelincuentes(); 
	
	String alos = delincuentes.getDatos(0, 1); 
	String magaña = delincuentes.getDatos(1, 1); 
	String silvia = delincuentes.getDatos(2, 1); 
	String noms[]={alos,magaña,silvia}; 
	
	setLayout(null); 
	
	list=new JList(); 
	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	list.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
	list.setListData(noms); 
	
	list.addListSelectionListener(new ListSelectionListener() { 
		public void valueChanged(ListSelectionEvent arg0) { 
		
		int a = list.getSelectedIndex(); 
		
		if(a==0){ 
		
			cajaNombre.repaint(); 
			cajaNombre.setText(delincuentes.getDatos(0, 1)); 
			cajaEdad.repaint(); 
			cajaEdad.setText(delincuentes.getDatos(0, 2)); 
			cajaSexo.repaint(); 
			cajaSexo.setText(delincuentes.getDatos(0, 3)); 
			cajaNacionalidad.repaint(); 
			cajaNacionalidad.setText(delincuentes.getDatos(0, 4)); 
			cajaDireccion.repaint();
			cajaDireccion.setText(delincuentes.getDatos(0, 5)); 
			cajaPoblacion.repaint();
			cajaPoblacion.setText(delincuentes.getDatos(0, 6)); 
			vista.getAntecedentes().getCaja().repaint(); 
			vista.getAntecedentes().getCaja().setText(delincuentes.getDatos(0, 7)); 
			
			} 
		
		if(a==1){ 
		
			cajaNombre.repaint(); 
			cajaNombre.setText(delincuentes.getDatos(1, 1)); 
			cajaEdad.repaint(); 
			cajaEdad.setText(delincuentes.getDatos(1, 2)); 
			cajaSexo.repaint(); 
			cajaSexo.setText(delincuentes.getDatos(1, 3)); 
			cajaNacionalidad.repaint(); 
			cajaNacionalidad.setText(delincuentes.getDatos(1, 4)); 
			cajaDireccion.repaint(); 
			cajaDireccion.setText(delincuentes.getDatos(1, 5)); 
			cajaPoblacion.repaint(); 
			cajaPoblacion.setText(delincuentes.getDatos(1, 6)); 
			vista.getAntecedentes().getCaja().repaint(); 
			vista.getAntecedentes().getCaja().setText(delincuentes.getDatos(1, 7)); 
			
			} 
			
		if(a==2){ 
			
			cajaNombre.repaint(); 
			cajaNombre.setText(delincuentes.getDatos(2, 1)); 
			cajaEdad.repaint(); 
			cajaEdad.setText(delincuentes.getDatos(2, 2)); 
			cajaSexo.repaint(); 
			cajaSexo.setText(delincuentes.getDatos(2, 3)); 
			cajaNacionalidad.repaint(); 
			cajaNacionalidad.setText(delincuentes.getDatos(2, 4)); 
			cajaDireccion.repaint(); 
			cajaDireccion.setText(delincuentes.getDatos(2, 5)); 
			cajaPoblacion.repaint(); 
			cajaPoblacion.setText(delincuentes.getDatos(2, 6)); 
			vista.getAntecedentes().getCaja().repaint(); 
			vista.getAntecedentes().getCaja().setText(delincuentes.getDatos(2, 7)); 
			
			} 
		
		} 
		
	}); 
	
	scrollPane = new JScrollPane(list); 
	scrollPane.setBounds(36, 80, 110, 70); 
	add(scrollPane); 
	
	lblNombre = new JLabel("Nombre"); 
	lblNombre.setBounds(213, 11, 178, 14); 
	add(lblNombre); 
	
	cajaNombre = new JTextField(); 
	cajaNombre.setColumns(10); 
	cajaNombre.setBounds(213, 33, 191, 20); 
	add(cajaNombre); 
	
	lblEdad = new JLabel("Edad"); 
	lblEdad.setBounds(213, 66, 35, 14); 
	add(lblEdad); 
	
	cajaEdad = new JTextField(); 
	cajaEdad.setColumns(10); 
	cajaEdad.setBounds(213, 84, 59, 20); 
	add(cajaEdad); 
	
	cajaSexo = new JTextField();
	cajaSexo.setColumns(10); 
	cajaSexo.setBounds(345, 84, 59, 20); 
	add(cajaSexo); 
	
	cajaNacionalidad = new JTextField(); 
	cajaNacionalidad.setColumns(10); 
	cajaNacionalidad.setBounds(213, 142, 191, 20); 
	add(cajaNacionalidad); 
	
	lblSexo = new JLabel("Sexo"); 
	lblSexo.setBounds(349, 64, 42, 14); 
	add(lblSexo); 
	
	lblDireccion = new JLabel("Direccion"); 
	lblDireccion.setBounds(213, 173, 178, 14); 
	add(lblDireccion); 
	
	cajaDireccion = new JTextField(); 
	cajaDireccion.setColumns(10); 
	cajaDireccion.setBounds(213, 198, 191, 20); 
	add(cajaDireccion); 
	
	lblPoblacion = new JLabel("Poblacion"); 
	lblPoblacion.setBounds(213, 229, 178, 14); 
	add(lblPoblacion); 
	
	cajaPoblacion = new JTextField(); 
	cajaPoblacion.setColumns(10); 
	cajaPoblacion.setBounds(213, 254, 191, 20); 
	add(cajaPoblacion); 
	
	botonAntecedentes = new JButton("Antecedentes >>"); 
	botonAntecedentes.setBounds(213, 312, 191, 23); 
	add(botonAntecedentes); 
	
	lblNacionalidad = new JLabel("Nacionalidad"); 
	lblNacionalidad.setBounds(213, 115, 178, 14); 
	add(lblNacionalidad); 
	
	lblNewLabel = new JLabel("Delincuentes:"); 
	lblNewLabel.setBounds(36, 48, 110, 14); 
	add(lblNewLabel); 

} 

	public JButton getBotonAntecedentes() { 
	
	return botonAntecedentes; 
	
	}

}