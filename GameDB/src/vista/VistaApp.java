package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu,mnJuegos,mnPerfil;
	private VistaPrincipal prin;
	

	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 409);
		
		prin=new VistaPrincipal();
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Principal");
		menuBar.add(mnNewMenu);
		
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		setContentPane(prin);
		
		
	}

}
