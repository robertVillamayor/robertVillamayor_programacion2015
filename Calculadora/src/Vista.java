import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField cajaNumeros;
	static JButton boton1;
	static JButton boton2;
	static JButton boton3;
	static JButton boton4;
	static JButton boton5;
	static JButton boton6;
	static JButton boton7;
	static JButton boton8;
	static JButton boton9;
	static JButton boton0;
	static JButton botonMas;
	static JButton botonMenos;
	static JButton botonMult;
	static JButton botonDividir;
	static JButton botonIgual;
	static JButton botonPunto;
	
	private Controladora contro;

	public Vista(Controladora cont) {
		contro=cont;
		setTitle("MI CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cajaNumeros = new JTextField();
		cajaNumeros.setBackground(Color.WHITE);
		cajaNumeros.setEditable(false);
		cajaNumeros.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		cajaNumeros.setBounds(29, 22, 430, 76);
		contentPane.add(cajaNumeros);
		cajaNumeros.setColumns(10);
		
		boton1 = new JButton("1");
		
		boton1.setBounds(31, 120, 89, 35);
		contentPane.add(boton1);
		
		boton6 = new JButton("6");
		boton6.setBounds(282, 165, 89, 35);
		contentPane.add(boton6);
		
		boton7 = new JButton("7");
		boton7.setBounds(31, 211, 89, 35);
		contentPane.add(boton7);
		
	    boton2 = new JButton("2");
		
		boton2.setBounds(155, 120, 89, 35);
		contentPane.add(boton2);
		
	    boton5 = new JButton("5");
		boton5.setBounds(155, 165, 89, 35);
		contentPane.add(boton5);
		
		boton8 = new JButton("8");
		boton8.setBounds(155, 211, 89, 35);
		contentPane.add(boton8);
		
		boton3 = new JButton("3");
		boton3.setBounds(282, 120, 89, 35);
		contentPane.add(boton3);
		
		boton9 = new JButton("9");
		boton9.setBounds(282, 211, 89, 35);
		contentPane.add(boton9);
		
		boton4 = new JButton("4");
		boton4.setBounds(31, 165, 89, 35);
		contentPane.add(boton4);
		
		boton0 = new JButton("0");
		boton0.setBounds(31, 257, 89, 35);
		contentPane.add(boton0);
		
		botonPunto = new JButton(".");
		botonPunto.setBounds(155, 257, 89, 35);
		contentPane.add(botonPunto);
		
		botonMas = new JButton("+");
		botonMas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		botonMas.setBounds(395, 132, 89, 23);
		contentPane.add(botonMas);
		
		botonMenos = new JButton("-");
		botonMenos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		botonMenos.setBounds(395, 165, 89, 23);
		contentPane.add(botonMenos);
		
		botonMult = new JButton("x");
		botonMult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonMult.setBounds(395, 205, 89, 23);
		contentPane.add(botonMult);
		
		botonDividir = new JButton("/");
		botonDividir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		botonDividir.setBounds(395, 244, 89, 23);
		contentPane.add(botonDividir);
		
		botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 25));
		botonIgual.setBounds(282, 257, 89, 35);
		contentPane.add(botonIgual);
	}
	
	public void enseña(){
		System.out.println(boton9.getText());
	}

	public JTextField getCajaNumeros() {
		return cajaNumeros;
	}

	public void setCajaNumeros(String c) {
		this.cajaNumeros.setText(c);
	}
	
}
