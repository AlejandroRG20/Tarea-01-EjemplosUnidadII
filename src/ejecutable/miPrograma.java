package ejecutable;

public class miPrograma {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] es " + args[i]);
			
		}
         System.out.println("Solo eso!");
	}

}
