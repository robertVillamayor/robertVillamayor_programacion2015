import modelo.ConexionDB;
import modelo.UsuariosModelo;
import vista.VistaApp;


public class Inicio {

	//EL METODO MAIN DONDE LANZAREMOS NUESTRA APLICACION
	public static void main(String[] args) {
		
		ConexionDB con;
		con=new ConexionDB("localhost","prueba","root","tonphp");
		
			if(con.conectDB()==true){
				System.out.println("SE HA CONECTADO CON EXITO");
			}else{
				System.out.println("ERROR EN LA CONEXION, NO SE HA CONECTADO");
			}
		
		vista.VistaApp vista = new VistaApp();
		vista.setVisible(true);
	
	}
}
