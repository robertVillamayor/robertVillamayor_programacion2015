import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class HolaRobert extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaRobert frame = new HolaRobert();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HolaRobert() {
		
		String nombre = "Paco Alcacer" ;
		int valor = 80 ;
		int valor2 = 20;
		int resultado=0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Escribe tu nombre :");
		lblNewLabel.setBounds(149, 25, 165, 14);
		contentPane.add(lblNewLabel);
		
		caja = new JTextField();
		caja.setBounds(121, 50, 155, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		caja.setText(nombre);
		
		JLabel lblNewLabel2 = new JLabel("Escribe un numero a sumar :");
		lblNewLabel2.setBounds(31, 100, 165, 14);
		contentPane.add(lblNewLabel2);		
		
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(31, 125, 155, 20);
		contentPane.add(caja2);
		
		nombre=Integer.toString(valor);
		caja2.setText(nombre);
		
		
		JLabel lblNewLabel3 = new JLabel("Escribe un numero a sumar :");
		lblNewLabel3.setBounds(238, 100, 165, 14);
		contentPane.add(lblNewLabel3);
		
	    caja3 = new JTextField();
		caja3.setColumns(10);
		caja3.setBounds(238, 125, 155, 20);
		contentPane.add(caja3);
		
		nombre=Integer.toString(valor2);
		caja3.setText(nombre);
		
		JLabel lblNewLabel4 = new JLabel("Resultado de la suma :");
		lblNewLabel4.setBounds(149, 189, 165, 14);
		contentPane.add(lblNewLabel4);
		
		caja4 = new JTextField();
		caja4.setColumns(10);
		caja4.setBounds(121, 216, 155, 20);
		contentPane.add(caja4);
		
		resultado = valor + valor2 ;
		nombre=Integer.toString(resultado);
		caja4.setText(nombre);
	}
}
