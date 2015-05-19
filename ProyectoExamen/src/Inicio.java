import Modelo.ConexionDB;
import Modelo.ModeloDelincuentes;
import Vista.VistaApp;


public class Inicio {

	public static void main(String[] args) {
		
		ConexionDB conexion = new ConexionDB("localhost","delincuentes","root","tonphp");
		ModeloDelincuentes delincuentes;
		
		
		
			if(conexion.conectDB()==true){
				System.out.println("Conectado con exito");
			}else{
				System.out.println("error");
			}
		
		VistaApp vista = new VistaApp();
		vista.setVisible(true);

	}

}
