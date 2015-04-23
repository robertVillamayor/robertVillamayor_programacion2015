import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;


public class VentanaConversor extends JFrame {

	private JPanel contenedor;
	private JTextField cajaEuros;
	private JTextField cajaDolares;
	private JLabel lblMensajeDeControl;
	private JTextField cajaMensaje;
	private JLabel lblEscribeValor;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valor) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(42, 53, 108, 14);
		contenedor.add(lblEuros);
		
		cajaEuros = new JTextField();
		cajaEuros.setBounds(42, 78, 86, 20);
		contenedor.add(cajaEuros);
		cajaEuros.setColumns(10);
		
		cajaDolares = new JTextField();
		cajaDolares.setBounds(42, 147, 86, 20);
		contenedor.add(cajaDolares);
		cajaDolares.setColumns(10);
		
		lblMensajeDeControl = new JLabel("Mensaje de control");
		lblMensajeDeControl.setBounds(42, 203, 145, 14);
		contenedor.add(lblMensajeDeControl);
		
		cajaMensaje = new JTextField();
		cajaMensaje.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 14));
		cajaMensaje.setForeground(Color.RED);
		cajaMensaje.setBounds(42, 231, 211, 20);
		contenedor.add(cajaMensaje);
		cajaMensaje.setColumns(10);
		
		lblEscribeValor = new JLabel("Escribe un valor entre 0 y 500 \u20AC");
		lblEscribeValor.setBounds(42, 11, 254, 14);
		contenedor.add(lblEscribeValor);
		
		Button button = new Button("Convertir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(Float.parseFloat(cajaEuros.getText())>=0 && Float.parseFloat(cajaEuros.getText())<=500){
						float euros;
						euros=Float.parseFloat(cajaEuros.getText());
						cajaDolares.setText(String.valueOf(euros*valor));
						cajaMensaje.setText("TODO OK");
					}else{
						cajaMensaje.setText("HAZ CASO AL MENSAJE DE ARRIBA");
					}
					
				}
				catch(NumberFormatException F) {
						cajaMensaje.setText("ESCRIBE NUMEROS PORFAVOR");
				}
				 
			}
		});
		button.setBounds(183, 145, 70, 22);
		contenedor.add(button);
		
	}
}
