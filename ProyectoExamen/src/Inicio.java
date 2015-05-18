import Modelo.ConexionDB;
import Modelo.ModeloUsuarios;
import Vista.VistaApp;


public class Inicio {

	public static void main(String[] args) {
	
		VistaApp vista = new VistaApp();
		vista.setVisible(true);
		
		ConexionDB conexion = new ConexionDB("localhost","delincuentes","root","");
		
		
		if(conexion.conectDB()==true){
			System.out.println("Conectado con exito");
		}else{
			System.out.println("error");
		}

	}

}
