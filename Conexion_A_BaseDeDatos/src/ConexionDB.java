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
	Connection conexion = null; //MANEJA LA CONEXION
	
	
	
	public ConexionDB(String HOST,String BBDD,String USER,String PASSWORD) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.password=PASSWORD;
	}
	
	public Boolean connectDB (){
		try{
			//LO PRIMERO ES CARGAR EL CONTROLADOR MYSQL EL CUAL AUTOMATICAMENTE SE REGISTRA
			Class.forName(CONTROLADOR_MYSQL);
			
			//CONECTARNOS A LA BASE DE DATOS
			conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.password);
		}
		catch(SQLException sqlException ){
			sqlException.printStackTrace();
			return false;
		}
		catch(ClassNotFoundException noEncontroClase){
			noEncontroClase.printStackTrace();
			return false;
		}
		return true;
	}

	public Connection getConexion() {
		return this.conexion;
	}
	
	
	

}
