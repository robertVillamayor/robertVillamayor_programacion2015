
public class Artista extends Grupo {
	
	private String nombreArtista;
	private int numero;
	private String nombreGrupo;
	
	public Artista(String nombre){
		this.nombreArtista=nombre;
	}
	public Artista(String nombre,int numero,String nombreG){
		this.nombreArtista=nombre;
		this.numero=numero;
		this.nombreGrupo=nombreG;
	}
	
	
	public String getNombreArtista (){
		return this.nombreArtista;
	}
	public int getNumero (){
		return this.numero;
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	
	
	
}
