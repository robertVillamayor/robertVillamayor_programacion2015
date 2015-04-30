import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ModeloConexion {

	//DEVOLVER CORREDORES
	private static String LISTADO_NOMBRES = "select * from personas";
	
	private static String ID = "id_persona";
	private static String NOMBRE = "nombre";
	private static String APELLIDOS = "apellidos";
	private static String TRABAJO = "trabajo";
	
	private static String COLUMNAS[]={ID,NOMBRE,APELLIDOS,TRABAJO};
	
	//CONEXION
	Connection conexion=null;
	Statement instruccion=null;
	ResultSet conjuntoResultados=null;
	
	public ModeloConexion(Connection conexion) {
		this.conexion=conexion;
	}
	
	public void getPersonas(){
		try{
			instruccion=conexion.createStatement();
			conjuntoResultados=instruccion.executeQuery(LISTADO_NOMBRES);
			
			//LISTAREMOS POR PANTALLA LOS DATOS
			while(conjuntoResultados.next()){
				System.out.print(conjuntoResultados.getInt(COLUMNAS[0])+" ");
				System.out.print(conjuntoResultados.getString(COLUMNAS[1])+" ");
				System.out.print(conjuntoResultados.getString(COLUMNAS[2])+" ");
				System.out.println(conjuntoResultados.getString(COLUMNAS[3]));
			}
		}
		catch(SQLException sqlException){
			sqlException.printStackTrace();
		}
		finally{
			try{
				instruccion.close();
				conjuntoResultados.close();
				conexion.close();
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
			}
		}
	}

}
