package modelo;

import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import Vista.FramePrincipal;


public class DatosUsuario {
	
	String nom;
	String contraseña;
	boolean conectado;
	String idioma;
	
	public DatosUsuario(String nombre,String contra,String tipo){
		 nom=nombre;
		 contraseña=contra;
		 
	if(tipo=="alumno"){
		try{
			URL url = new URL("http://agendavirtual.ddns.net/api/api.php?accion=get&tabla=alumno%20where%20idalumno=%27"+nom+"%27%20AND%20contrasena=%27"+contraseña+"%27%20&valor=*");
			InputStream is =url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray arrayJson = obj.getJsonArray("0");
			JsonObject objeFinal = arrayJson.getJsonObject(0);
			this.conectado=true;
			
		}catch(Exception e){
			System.out.println("fallo en el registro");
		}
		}
	if(tipo=="profesor"){
		try{
			URL url = new URL("http://agendavirtual.ddns.net/api/api.php?accion=get&tabla=profesor%20where%20idprofesor=%27"+nom+"%27%20AND%20contrasena=%27"+contraseña+"%27%20&valor=*");
			InputStream is =url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray arrayJson = obj.getJsonArray("0");
			JsonObject objeFinal = arrayJson.getJsonObject(0);
			System.out.println(objeFinal.getString("nombre"));
			this.conectado=true;
		}catch(Exception e){
			System.out.println("fallo en el registro");
		}
	}

	}
	
	public boolean getConectado(){
		return conectado;
	}
	
	
	
}
