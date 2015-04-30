
public class Modelo{
	static char simbolos []={'+','-','x','/','.','='};
	static int botones []={0,1,2,3,4,5,6,7,8,9};
	
	private String numero[];
	private char simbolo[];
	
	public Modelo (){
		
	numero = new String  [10];
	simbolo = new char [10];
	
	}
	
	
	
	

	public char[] getSimbolos() {
		return simbolos;
	}

	public void setSimbolos(char[] simbolos) {
		this.simbolos = simbolos;
	}





	public String getNumero(int b) {
		return numero[b];
	}





	public void setNumero(int a,String numero) {
		this.numero[a] = numero;
	}
	
	
	
	public char getSimbolo(int b) {
		return simbolo[b];
	}





	public void setSimbolo(int b,char simbolo) {
		this.simbolo[b] = simbolo;
	}






	
	
	
	

	

	


	
	
}

