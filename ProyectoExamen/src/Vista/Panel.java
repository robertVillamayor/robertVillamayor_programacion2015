package Vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Modelo.ModeloDelincuentes;


public class Panel extends JPanel {

	private DefaultTableModel dtm;	
	private JTable table;
	private JScrollPane scrollPane;
	
	private ModeloDelincuentes modelo;
	
	public Panel() {

		modelo=new ModeloDelincuentes();
		setBounds(100, 100, 650, 450);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		
		String [] nombreColumnas = {"ID","NOMBRE","EDAD","SEXO","NACIONALIDAD","DIRECCION","POBLACION","ANTECEDENTES"};
	
		dtm=new DefaultTableModel(null,nombreColumnas);
		
		table = new JTable(dtm);
		
		TableColumn columna=table.getColumnModel().getColumn(0);
		columna.setPreferredWidth(15);
		TableColumn columna2=table.getColumnModel().getColumn(1);
		columna2.setPreferredWidth(35);
		TableColumn columna3=table.getColumnModel().getColumn(2);
		columna3.setPreferredWidth(25);
		TableColumn columna4=table.getColumnModel().getColumn(3);
		columna4.setPreferredWidth(30);
		TableColumn columna5=table.getColumnModel().getColumn(4);
		columna5.setPreferredWidth(80);
		TableColumn columna6=table.getColumnModel().getColumn(5);
		columna6.setPreferredWidth(60);
		TableColumn columna7=table.getColumnModel().getColumn(6);
		columna7.setPreferredWidth(60);
		TableColumn columna8=table.getColumnModel().getColumn(7);
		columna8.setPreferredWidth(80);
		
		String id=modelo.getDatos(0, 0);
		String nombre=modelo.getDatos(0, 1);
		String edad=modelo.getDatos(0, 2);
		String sexo=modelo.getDatos(0, 3);
		String nacionalidad=modelo.getDatos(0, 4);
		String direccion=modelo.getDatos(0, 5);
		String poblacion=modelo.getDatos(0, 6);
		String antecedentes=modelo.getDatos(0, 7);
		
		String [] datos = {id,nombre,edad,sexo,nacionalidad,direccion,poblacion,antecedentes};
		
		
		dtm.addRow(datos);
		scrollPane = new JScrollPane (table);
		add(scrollPane);
	}

}
