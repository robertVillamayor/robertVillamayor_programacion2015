package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
		//DATOS DE LA CONEXION
		static final String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
		
		//DATOS DE LA BASE DE DATOS
		private String host;
		private String bbdd;
		private String user;
		private String password;
		
		//CONEXION
		static Connection conexion = null; //MANEJA LA CONEXION
		
		//CONSTRUCTOR
		public ConexionDB(String host,String bbdd,String user,String password) {
			
			this.host=host;
			this.bbdd=bbdd;
			this.user=user;
			this.password=password;
		}
		
		//METODO QUE NOS DEVUELVE TRUE SI LA CONEXION HA SIDO CORRECTA Y FALSE SI HA HABIDO ALGUN FALLO
		public boolean conectDB (){
			try{
				//LO PRIMERO ES CARGAR EL CONTROLADOR MYSQL EL CUAL AUTOMATICAMENTE SE REGISTRA
				Class.forName(CONTROLADOR_MYSQL);
				
				//CONECTAREMOSA A LA BASE DE DATOS
				conexion=DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.password);
				}
			catch(SQLException sqlException){
				sqlException.printStackTrace();
				return false;
			}
			catch(ClassNotFoundException claseNoEncontrada){
				claseNoEncontrada.printStackTrace();
				return false;
			}
			return true;
			
			}

		//GETTER PARA ACCEDER A LA CONEXION DESDE OTRA CLASE
		public static Connection getConexion(){
			return conexion;
		}
}
