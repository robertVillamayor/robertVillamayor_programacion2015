
public class ConexionBaseDatos {

	public static void main(String[] args) {
		
		ModeloConexion modelo;
		ConexionDB conection;
		conection = new ConexionDB("localhost","prueba","root","");
		
		if(conection.connectDB()==true){
			System.out.println("SE HA CONECTADO CON EXITO");
			modelo=new ModeloConexion(conection.getConexion());
			modelo.getPersonas();
			System.out.println("LISTADO DE PERSONAS");
		}
		else{
			System.out.println("ERROR EN LA CONEXION");
		}
		

	}

}
