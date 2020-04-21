import java.util.ArrayList;

public class TerminadosEnTres {
	public static void main(String [] args) {
		
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(13);
		numero.add(50);
		numero.add(30);
		numero.add(23);
		numero.add(503);
		System.out.println(verTerminaTres(numero));
	}
	
	public static int verTerminaTres(ArrayList<Integer>numero) {
		int contador = 0;
		Object comprobar[] = numero.toArray();
		for (int i = 0; i < comprobar.length; i++) {
			if(String.valueOf(comprobar[i]).endsWith("3")) {
				contador++;
			}
		}
		return contador;
	}
	
}
