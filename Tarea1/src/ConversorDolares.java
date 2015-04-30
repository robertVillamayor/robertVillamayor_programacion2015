import java.awt.EventQueue;


public class ConversorDolares {

	public static void main(String[] args) {
		float conversion = 1.25f;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConversor frame = new VentanaConversor(conversion);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
