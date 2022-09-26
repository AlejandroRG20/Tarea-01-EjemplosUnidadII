package modificadores;

public class demoModificadores {

		Integer variableInstancia = 10;
		static Integer variableEstatica = 15;
		private void probar(){
			variableInstancia = 10;
			Integer variableLocal = 10;
			System.out.println("Dentro del metodo no estatico probar()");
		}
		public static void probarEstatico(){
			Integer OtraVariableLocal = 50;
			System.out.println("Dentro del metodo estatico probarEstatico()");
		}
		public static void main(String[] args){
			demoModificadores objeto = new demoModificadores();
			demoModificadores otroObjeto = new demoModificadores();
			System.out.println("Dentro del metodo main()");
			objeto.probar();
			probarEstatico();
			objeto.variableInstancia = 100;
			otroObjeto.variableInstancia = 500;
			
			variableEstatica = 25;
			demoModificadores.variableEstatica = 30;
		}


		}
