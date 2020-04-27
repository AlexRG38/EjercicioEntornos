import java.util.ArrayList;

/**
 * 
 * @author Alejandro Ruiz Gallego
 *
 */
public class TerminadosEnTres {
	
	/**
	 * Metodo main de la clase TerminadosEnTres
	 * @param args
	 */
	public static void main(String [] args) {
		
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(13);
		numero.add(50);
		numero.add(30);
		numero.add(23);
		numero.add(503);
		System.out.println(verTerminaTres(numero));
	}
	
	/**
	 * Este metodo sirve para saber los numeros que contiene la arraylist nummero terminen en 3
	 * @param numero
	 * @return contador
	 */
	public static int verTerminaTres(ArrayList<Integer>numero) {
		int contador = 0;
		Object comprobador[] = numero.toArray();
		for (int i = 0; i < comprobador.length; i++) {
			if(String.valueOf(comprobador[i]).endsWith("3")) {
				contador++;
			}
		}
		return contador;
	}
	
}
