import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;


public class Principal extends JPanel {

	private JLabel lblNewLabel;
	
	public Principal() {
		setLayout(null);
		
		lblNewLabel = new JLabel("Esta es la principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 53));
		lblNewLabel.setBounds(0, 80, 486, 165);
		add(lblNewLabel);

	}
}
