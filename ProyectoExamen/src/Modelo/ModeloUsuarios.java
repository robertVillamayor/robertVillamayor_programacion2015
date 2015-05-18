package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloUsuarios {

		//GENERAMOS LAS VARIABLES QUE NECESITAMOS
		private static String LISTADO_USUARIOS = "select * from usuarios";
		private static String ID = "id";
		private static String USUARIO = "usuario";
		private static String PASS = "pass";
		
		private ArrayList<Object> usuarios=null;
		private ArrayList<Object> id=null;
		private ArrayList<Object> pass=null;
		
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public ModeloUsuarios() {
			conexion=ConexionDB.getConexion();
			usuarios=new ArrayList<Object>();
			id=new ArrayList<Object>();
			pass=new ArrayList<Object>();
		}
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS,EN ESTE CASO EL ID
		public ArrayList getId( ){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_USUARIOS);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					id.add(conjuntoResultados.getInt(ID));
				}
				return id;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return id;
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
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS,EN ESTE CASO EL USUARIO
		public ArrayList getUsuarios(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_USUARIOS);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					usuarios.add(conjuntoResultados.getString(USUARIO));
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
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS,EN ESTE CASO EL PASSWORD
		public ArrayList getPass(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_USUARIOS);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					pass.add(conjuntoResultados.getString(PASS));
				}
				return pass;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return pass;
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
