package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class VistaApp extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnNewMenu,mnJuegos,mnPerfil;
	private VistaPrincipal prin;
	private VistaJuegos juegos;
	

	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 409);
		
		prin=new VistaPrincipal();
		juegos=new VistaJuegos();
		
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
