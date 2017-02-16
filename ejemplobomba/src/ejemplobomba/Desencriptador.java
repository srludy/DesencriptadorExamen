package ejemplobomba;

public class Desencriptador {
	String mensaje;
	String mensajeCodificado;
	String temporal;
	int saltos;

public Desencriptador(){
	mensaje = "";
	mensajeCodificado ="ME  LA PONE TIESAPACO";
	temporal = "";
	saltos = 4;
	
}
	public static void main(String[] args) {
		Desencriptador B = new Desencriptador();
		B.metodoDesEncriptador();

	}

public void metodoDesEncriptador(){
	temporal = mensajeCodificado;
	for (int i = 0 ; i < saltos ; i++){
		//mensaje =temporal.substring(1,temporal.length())+temporal.substring(0,1);
		mensaje =temporal.substring(temporal.length()-1,temporal.length())+ temporal.substring(0,temporal.length()-1);
		temporal= mensaje;
	}
	System.out.println(mensaje);		
	
	}
}
