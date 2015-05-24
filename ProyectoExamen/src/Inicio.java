import Modelo.ConexionDB;
import Modelo.ModeloUsuarios;
import Vista.VistaApp;


public class Inicio {

	public static void main(String[] args) {
		//,
		ConexionDB conexion = new ConexionDB("localhost","delincuentes","root","");
		
		
		
		
			if(conexion.conectDB()==true){
				System.out.println("Conectado con exito");
				ModeloUsuarios m=new ModeloUsuarios();
				System.out.println(m.getDatos(0, 2));
				System.out.println(m.getDatos(1, 2));
			}else{
				System.out.println("error");
			}
		
		VistaApp vista = new VistaApp();
		vista.setVisible(true);

	}

}
