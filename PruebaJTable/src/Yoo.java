import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class Yoo extends JPanel {

	private DefaultTableModel dtm;	
	private JTable table;
	private JScrollPane scrollPane;
	
	public Yoo() {

		setBounds(100, 100, 450, 300);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		
		String [] nombreColumnas = {"Nombre","Apellidos","Curso"};
	
		Object [] columnaNueva = {"Profesor","Mecanico","Astronauta","Policia"};
		
		
		dtm=new DefaultTableModel(null,nombreColumnas);
		
		table = new JTable(dtm);
		scrollPane = new JScrollPane (table);
		
		/*dtm.addColumn("Tipo",columnaNueva);
		dtm.addRow(nombreColumnas);*/
		
		
		add(scrollPane);
	}

}
