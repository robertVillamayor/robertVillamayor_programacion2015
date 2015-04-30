import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ModeloConexion {

	//DEVOLVER CORREDORES
	private static String LISTADO_NOMBRES = "select * from personas";
	
	private static String NOMBRE = "nombre";
	private static String APELLIDOS = "apellidos";
	
	private static String COLUMNAS[]={NOMBRE,APELLIDOS};
	
	//CONEXION
	Connection conexion = null; //MANEJA LA CONEXION
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
	
	public ModeloConexion(Connection conexion) {
		this.conexion=conexion;
	}
	
	public void getPersonas(){
		try{
			instruccion=conexion.createStatement();
			conjuntoResultados=instruccion.executeQuery(LISTADO_NOMBRES);
			
			//LISTAREMOS POR PANTALLA LOS DATOS
			while(conjuntoResultados.next()){
				System.out.print(conjuntoResultados.getString(NOMBRE)+" ");
				System.out.println(conjuntoResultados.getString(APELLIDOS));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				instruccion.close();
				conjuntoResultados.close();
				conexion.close();
			}
			catch(SQLException j){
				j.printStackTrace();
			}
		}
	}

}
