package ESTRUCTURA;
import ESTRUCTURA.sub.*;
public class claseEstructura {
		public class claseSecreta {
	
	}
			//metodo
			public float obtenerTemperatura() {
				return temperatura;
			}
			public static int obtenerNumeroGrande() {
				return UN_NUMERO_GRANDE;
			}
			//variables
			private static int UN_NUMERO_GRANDE=123456;
			private float temperatura;
			//metodo constructor
			public claseEstructura() {
				temperatura=98.4f;
			}
			//metodo
			public void hacerUno() {
				//Creacion de un objeto(instancia)
				UnConcepto uc=new UnConcepto();
			}
			//variable de una vlase de otro paquete
			//nombre completo, ya que no fue importado
			
			//Clase interna a la clase principal
			class ClaseInterna{
				public void hacerAlgo() {}
			}


	}



