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
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public ModeloDelincuentes() {
			
			
			String nombreDatos[]=new String[3];
			conexion=ConexionDB.getConexion();
					
			datos=new ArrayList<String[]>();
		}
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS
		public void delin(){
			
			try{
				datos=new ArrayList <String[]>();
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				int a=0;
				while(conjuntoResultados.next()){
					String x[]=new String[titulos.length];
					
						for(int f=0;f<titulos.length;f++){
							x[f]=conjuntoResultados.getString(titulos[f]);
							if(f==1){
								nombreDatos[a]=conjuntoResultados.getString(titulos[f]);
							}
							
						}
						
					datos.add(x);
					a++;
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
		
		public String  getDatos(int x,int y){
			return datos.get(x)[y];
		}
		
		public String[] getNombres(){
			return nombreDatos;
		}

}
