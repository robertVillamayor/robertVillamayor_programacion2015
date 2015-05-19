package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaApp extends JFrame {

	private Principal principal;
	private Delincuentes delincuentes;
	private Antecedentes antecedentes;
	
	private JMenuBar menuBar;
	private JMenu mnPrincipal,mnDelincuentes;
	private JMenuItem mntmPrincipal,mntmDelincuentes;
	private JPanel contentPane;
	


	public VistaApp() {
		
		contentPane=new JPanel();
		principal=new Principal();
		delincuentes=new Delincuentes();
		antecedentes=new Antecedentes();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 404);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				antecedentes.setVisible(false);
				delincuentes.setVisible(false);
				contentPane.setVisible(false);
				principal.setVisible(true);
				setContentPane(principal);
			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		mnDelincuentes = new JMenu("Delincuentes");
		menuBar.add(mnDelincuentes);
		
		mntmDelincuentes = new JMenuItem("Delincuentes");
		mntmDelincuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				antecedentes.setVisible(false);
				principal.setVisible(false);
				contentPane.setVisible(false);
				delincuentes.setVisible(true);
				setContentPane(delincuentes);
			}
		});
		mnDelincuentes.add(mntmDelincuentes);
		
		delincuentes.getBotonAntecedentes().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				delincuentes.setVisible(false);
				principal.setVisible(false);
				contentPane.setVisible(false);
				antecedentes.setVisible(true);
				setContentPane(antecedentes);
			}
		});
		
		setContentPane(contentPane);
		
		

	}
	public Principal getPrincipal() {
		return principal;
	}


	public Delincuentes getDelincuentes() {
		return delincuentes;
	}


	public Antecedentes getAntecedentes() {
		return antecedentes;
	}
}
