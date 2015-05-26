
public class Inicio {

	public static void main(String[] args) {
		Controladora cont = new Controladora ();
		Vista vista = new Vista(cont);
		
		vista.enseña();
	}

}
