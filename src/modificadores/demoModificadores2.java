package modificadores;

public class demoModificadores2 {
	public void probar() {
		System.out.println("Dentro del metodo no estatico probar()");
	}
    public static void probarEstatico() {
    	System.out.println("Dentro del metodo estatico probarEstatico()");
    }
	
	public static void main(String[] args) {
		demoModificadores2 objeto = new demoModificadores2();
		System.out.println("Dentro del metodo main()");
		objeto.probar();
		probarEstatico();
	}
		

}
