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
		
		private ArrayList<Object> id=null;
		private ArrayList<Object> nombre=null;
		private ArrayList<Object> edad=null;
		private ArrayList<Object> sexo=null;
		private ArrayList<Object> nacionalidad=null;
		private ArrayList<Object> direccion=null;
		private ArrayList<Object> poblacion=null;
		private ArrayList<Object> antecedentes=null;
		
		private ConexionDB conex;

		
		//CONEXION
		Connection conexion=null;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		
		public ModeloDelincuentes() {
			
			conexion=ConexionDB.getConexion();
			
			id=new ArrayList<Object>();
			nombre=new ArrayList<Object>();
			edad=new ArrayList<Object>();
			sexo=new ArrayList<Object>();
			nacionalidad=new ArrayList<Object>();
			direccion=new ArrayList<Object>();
			poblacion=new ArrayList<Object>();
			antecedentes=new ArrayList<Object>();
			
		}
		
		//METODO QUE NOS DEVUELVE UN ARRAY LIST DE LA CONSULTA DE DATOS
		public ArrayList getNombre(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					nombre.add(conjuntoResultados.getString(NOMBRE));
				}
				return nombre;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return nombre;
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
		
		public ArrayList getEdad(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					edad.add(conjuntoResultados.getString(EDAD));
				}
				return edad;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return edad;
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
		
		public ArrayList getSexo(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					sexo.add(conjuntoResultados.getString(SEXO));
				}
				return sexo;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return sexo;
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
		
		public ArrayList getNacionalidad(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					nacionalidad.add(conjuntoResultados.getString(NACIONALIDAD));
				}
				return nacionalidad;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return nacionalidad;
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
		
		public ArrayList getDireccion(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					direccion.add(conjuntoResultados.getString(DIRECCION));
				}
				return direccion;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return direccion;
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
		
		public ArrayList getPoblacion(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					poblacion.add(conjuntoResultados.getString(POBLACION));
				}
				return poblacion;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return poblacion;
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
		
		public ArrayList getAntecedentes(){
			try{
				instruccion=conexion.createStatement();
				conjuntoResultados=instruccion.executeQuery(LISTADO_DELINCUENTES);
				
				//LISTAREMOS POR PANTALLA LOS DATOS
				while(conjuntoResultados.next()){
					antecedentes.add(conjuntoResultados.getString(ANTECEDENTES));
				}
				return antecedentes;
			}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return antecedentes;
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
