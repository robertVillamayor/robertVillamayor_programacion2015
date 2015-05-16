import modelo.ConexionDB;
import vista.VistaApp;


public class Inicio {

	public static void main(String[] args) {
		
		ConexionDB con;
		con=new ConexionDB("localhost","proba","root","");
		
		if(con.conectDB()==true){
			System.out.println("SE HA CONECTADO CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION, NO SE HA CONECTADO");
		}
		
		
		
		vista.VistaApp vista = new VistaApp();
		vista.setVisible(true);
	
	}
}
