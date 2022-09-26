package paqueteUno;
import paqueteUno.subpaquete.claseB;
public class importa2 {
	
	//import paquetados.ClaseUno;


		public static void main(String[] args) {
	        claseUno cUno = new claseUno();
	        System.out.println(cUno.toString());
	        
	        paqueteUno.subpaquete.claseA cA = new paqueteUno.subpaquete.claseA();
	        System.out.println(cA.toString());

	        claseB cB = new claseB();
	        System.out.println(cB.toString());
	        
	        claseUno cUnoNuevo = new claseUno();
	        System.out.println(cUnoNuevo.toString());

	        
		

}
}
