package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloDelincuentes {

		//GENERAMOS LAS VARIABLES QUE NECESITAMOS
		private static String LISTADO_DELINCUENTES = "select * from delincuentes";
		private static String ID = "id";
		private static String NOMBRE = "nombre";
		private static String EDAD = "edad";
		private static String SEXO = "sexo";
		private static String NACIONALIDAD = "nacionalidad";
		private static String DIRECCION = "direccion";
		private static String POBLACION = "poblacion";
		private static String ANTECEDENTES = "antecedentes";
		
		private ArrayList<String[]> datos;
		private String nombreDatos [];
		private String titulos[]={ID,NOMBRE,EDAD,SEXO,NACIONALIDAD,DIRECCION,POBLACION,ANTECEDENTES};
		private ArrayList<Object> personas=null;
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public ModeloDelincuentes() {
			
			
			String nombreDatos[]=new String[3];
			conexion=ConexionDB.getConexion();
			personas=new ArrayList<Object>();
			datos=new ArrayList<String[]>();
			delin();
		}
		
		//metodo que nos guarda los datos en un arrayList
		public void delin(){
			
			try{
				datos=new ArrayList <String[]>();
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				
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
		
		public ArrayList getPersonas( ){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					personas.add(conjuntoResultados.getString(NOMBRE));
				}
				return personas;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return personas;
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
