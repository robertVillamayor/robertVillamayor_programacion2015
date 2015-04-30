
public class Principal {
	
	public static void main(String[] args) {

		ModeloConexion modelo;
		ConexionDB conexion;
		conexion = new ConexionDB("localhost","prueba","root","");
		
		if(conexion.conectDB()==true){
			System.out.println("SE HA CONECTADO CON EXITO");
			modelo=new ModeloConexion(conexion.getConexion());
			modelo.getPersonas();
		}else{
			System.out.println("ERROR EN LA CONEXION, NO SE HA CONECTADO");
		}
		
		
	}

}
