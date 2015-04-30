
public class Principal {

	public static void main(String[] args) {
		
		Grupo grupo1 = new Grupo ();
		grupo1.setNombreGrupo("ExtremoDuro");
		Artista artista1 = new Artista("Robert",3,grupo1.getNombreGrupo());
		artista1.setNombreGrupo(grupo1.getNombreGrupo());
		Grupo grupo2 = new Grupo ();
		grupo2.setNombreGrupo("El canto del loco");
		Artista artista2 = new Artista("Daniel",2,grupo2.getNombreGrupo());
		artista2.setNombreGrupo(grupo2.getNombreGrupo());
		Grupo grupo3=new Grupo();
		grupo3.setNombreGrupo("La oreja de Van Goh");
		Artista artista3 = new Artista ("Juan",1,grupo3.getNombreGrupo());
		artista3.setNombreGrupo(grupo3.getNombreGrupo());
		
		
		System.out.println("El artista1 se llama: "+artista1.getNombreArtista()+" con valor: "+artista1.getNumero()+" y pertenece al grupo: "+artista1.getNombreGrupo());
	    System.out.println("El artista2 se llama: "+artista2.getNombreArtista()+" con valor: "+artista2.getNumero()+" y pertenece al grupo: "+artista2.getNombreGrupo());
	    System.out.println("El artista3 se llama: "+artista3.getNombreArtista()+" con valor: "+artista3.getNumero()+" y pertenece al grupo: "+artista3.getNombreGrupo());
	}
	
	

}
