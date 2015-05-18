package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuariosModelo {

		//GENERAMOS LAS VARIABLES QUE NECESITAMOS
		private static String LISTADO_NOMBRES = "select * from personas";
		private static String NOMBRE = "nombre";
		private ArrayList<String> usuarios=null;
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public UsuariosModelo() {
			conexion=ConexionDB.getConexion();
			usuarios=new ArrayList<String>();
		}
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS
		public ArrayList getPersonas(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_NOMBRES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					usuarios.add(conjuntoResultados.getString(NOMBRE));
					System.out.println(conjuntoResultados.getString(NOMBRE));
				}
				return usuarios;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return usuarios;
			}
			finally{
				try{
					instruccion.close();
					conjuntoResultados.close();
				}
				catch(SQLException sqlException){
					sqlException.printStackTrace();
				}
			}
		}


}
