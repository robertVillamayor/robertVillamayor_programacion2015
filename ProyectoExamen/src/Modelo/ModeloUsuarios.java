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
		
		private ArrayList<String[]> datos;
		private String titulos[]={ID,USUARIO,PASS};
		
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public ModeloUsuarios() {
			
			datos=new ArrayList<String[]>();
			conexion=ConexionDB.getConexion();
			usuarios=new ArrayList<Object>();
			id=new ArrayList<Object>();
			pass=new ArrayList<Object>();
			usuario();
		}
		
		
public void usuario(){
			
			try{
				datos=new ArrayList <String[]>();
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_USUARIOS);
				
				
				while(conjuntoResultados.next()){
					String x[]=new String[titulos.length];
					
						for(int f=0;f<titulos.length;f++){
							x[f]=conjuntoResultados.getString(titulos[f]);
						}
						
					datos.add(x);
				}
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				
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
		

		
		public String  getDatos(int x,int y){
			return datos.get(x)[y];
		}



}
