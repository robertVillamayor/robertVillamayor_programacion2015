import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;


public class VistaApp extends JFrame {

	private JPanel contentPane;
	
	private Principal princi;
	private Delincuentes delin;
	private JMenuBar menuBar;
	private JMenu mnPrincipal;
	private JMenu mnDelincuentes;
	private JMenuItem mntmPrincipal;
	private JMenuItem mntmDelincuentes;
	

	public VistaApp() {
		
		princi=new Principal();
		delin=new Delincuentes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 347);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(princi,"principal");
		princi.setLayout(null);
		
		contentPane.add(delin,"delincuentes");
		delin.setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "principal");
			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		mnDelincuentes = new JMenu("Delincuentes");
		menuBar.add(mnDelincuentes);
		
		mntmDelincuentes = new JMenuItem("Delincuentes");
		mntmDelincuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "delincuentes");
			}
		});
		mnDelincuentes.add(mntmDelincuentes);
		
		setContentPane(contentPane);
		
		
	}
}
