import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Delincuentes extends JPanel {

	private JPanel contenedor,delincuentes,antecedentes;
	private JLabel lblEstoEsDelincuentes,lblEstoEsAntecedentes;
	private JButton btnVolver,btnAntecedentes;
	
	public Delincuentes() {
		
		setLayout(null);
		
		contenedor = new JPanel();
		contenedor.setBounds(0, 0, 450, 300);
		add(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		delincuentes = new JPanel();
		contenedor.add(delincuentes, "delincuentes");
		delincuentes.setLayout(null);
		
		antecedentes = new JPanel();
		contenedor.add(antecedentes, "antecedentes");
		antecedentes.setLayout(null);
		
		lblEstoEsDelincuentes = new JLabel("Esto es delincuentes");
		lblEstoEsDelincuentes.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblEstoEsDelincuentes.setBounds(10, 69, 430, 139);
		delincuentes.add(lblEstoEsDelincuentes);
		
		btnAntecedentes = new JButton("Antecedentes");
		btnAntecedentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) contenedor.getLayout();
				c.show(contenedor, "antecedentes");
			}
		});
		btnAntecedentes.setBounds(29, 240, 159, 23);
		delincuentes.add(btnAntecedentes);
		
		lblEstoEsAntecedentes = new JLabel("Esto es antecedentes");
		lblEstoEsAntecedentes.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblEstoEsAntecedentes.setBounds(50, 78, 361, 88);
		antecedentes.add(lblEstoEsAntecedentes);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) contenedor.getLayout();
				c.show(contenedor, "delincuentes");
			}
		});
		btnVolver.setBounds(91, 228, 89, 23);
		antecedentes.add(btnVolver);

	}
}
