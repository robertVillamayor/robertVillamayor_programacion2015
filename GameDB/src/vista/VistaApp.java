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
import javax.swing.JMenuItem;

public class VistaApp extends JFrame {

	//DECLARAMOS LAS VARIABLES
	private JMenuBar menuBar;
	private JMenu mnNewMenu,mnJuegos,mnPerfil;
	private VistaPrincipal prin;
	private VistaJuegos juegos;
	private JMenuItem mntmPrincipal;
	private JPanel contentPane;
	private JMenuItem mntmJuegos;
	private JMenuItem mntmPerfil;
	

	//EN EL CONSTRUCTOR DE LA CLASE DISEÑAMOS EL FRAME CON LOS COMPONENTES
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 409);
		
		contentPane=new JPanel();
		prin=new VistaPrincipal();
		juegos=new VistaJuegos();
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Principal");
		menuBar.add(mnNewMenu);
		
		mntmPrincipal = new JMenuItem("Principal");
		//ACCION PARA QUE ABRA LA VISTA PRINCIPAL AL PULSAR EL BOTON PRINCIPAL DEL MENU
				mntmPrincipal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						juegos.setVisible(false);
						contentPane.setVisible(false);
						prin.setVisible(true);
						setContentPane(prin);
					}
				});
		mnNewMenu.add(mntmPrincipal);
		
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		mntmJuegos = new JMenuItem("Juegos");
		//ACCION PARA QUE ABRA LA VISTA JUEGOS AL PULSAR EL BOTON JUEGOS DEL MENU
				mntmJuegos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						prin.setVisible(false);
						contentPane.setVisible(false);
						juegos.setVisible(true);
						setContentPane(juegos);
					}
				});
		mnJuegos.add(mntmJuegos);
		
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
		
		
		setContentPane(contentPane);
		
		//ACCION PARA QUE EN LA VISTA PRINCIPAL, CUANDO PULSES EL BOTON JUEGOS SE CAMBIA LA VISTA A JUEGOS
		prin.getBtnJuegos().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				prin.setVisible(false);
				contentPane.setVisible(false);
				juegos.setVisible(true);
				setContentPane(juegos);
			}
		});
	}

}
