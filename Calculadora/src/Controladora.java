import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controladora {
	private Modelo mod;
	private Vista frame ;
	
	public Controladora ()
	{
		frame = new Vista(this);
		mod=new Modelo();
		frame.setVisible(true);
		
		frame.boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[1]));
				ponNumero(frame.boton1.getText());
			
			}
		});
		
		frame.boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[2]));
				ponNumero(frame.boton2.getText());
			
			}
		});
		
		frame.boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[3]));
			ponNumero(frame.boton3.getText());
			
			}
		});
		
		frame.boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[4]));
			ponNumero(frame.boton4.getText());
			
			}
		});
		
		frame.boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[5]));
				ponNumero(frame.boton5.getText());
			
			}
		});
		
		frame.boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[6]));
				ponNumero(frame.boton6.getText());
			
			}
		});
		
		frame.boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[7]));
				ponNumero(frame.boton7.getText());
			
			}
		});
		
		frame.boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[8]));
				ponNumero(frame.boton8.getText());
			
			}
		});
		
		frame.boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[9]));
				ponNumero(frame.boton9.getText());
			
			
			}
		});
		
		frame.boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.botones[0]));
				ponNumero(frame.boton0.getText());
			
			}
		});
		
		frame.botonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.simbolos[0]));
			
			
			}
		});
		
		frame.botonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.simbolos[1]));
			
			
			}
		});
		
		frame.botonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.simbolos[2]));
			
			
			}
		});
		
		frame.botonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.simbolos[3]));
			
			
			}
		});
		
		frame.botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String h=frame.getCajaNumeros().getText();
				mod.setNumero(0,h);
				//System.out.println(mod.getNumero(0));
				for(int a = 0;a>mod.simbolos.length;a++){
					char j=mod.simbolos[a];
					for(int b=0;b>h.length();b++){
						char g = h.charAt(b);
						if(j==g){
							mod.setSimbolo(0,j);
							
							
						}
					
					}
					System.out.println(mod.getSimbolo(0));
				}
				//char j =  mod.getNumero(0).charAt(0);
				//System.out.println(j);
				
				frame.setCajaNumeros(frame.getCajaNumeros().getText()+String.valueOf(mod.simbolos[5]));
			
			
			}
		});
		
		
	}
public void ponNumero(String numero){
	
	try{	
		String p = numero;
		String k = frame.getCajaNumeros().getText();
		float num = Float.valueOf(k);
		frame.setCajaNumeros(k+p);
		}
	catch(NumberFormatException g){
		String p = numero;
		String k = frame.getCajaNumeros().getText();
		frame.setCajaNumeros(p);
		}
}
public void ponSimbolo (){
	
}

}


