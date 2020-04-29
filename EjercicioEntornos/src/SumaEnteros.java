import java.util.ArrayList;
/**
 * 
 * @author Francisco Nieto-Marquez Guijarro
 *
 */
public class SumaEnteros {
	/**
	 * Metodo main de la clase Suma Enteros
	 * @param args
	 */
	public static void main(String [] args) {
		
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(13);
		numero.add(50);
		numero.add(30);
		numero.add(23);
		numero.add(503);
		System.out.println(sumatorio(numero));
	}
	/**
	 * Este metodo sirve para realizar la suma y media de los numeros enteros
	 * @param numero
	 * @return suma
	 */
	public static int sumatorio(ArrayList<Integer>numero) {
		int suma = 0;
		Object comprobador[] = numero.toArray();
		for (int i = 0; i < comprobador.length; i++) {
			suma += Integer.parseInt(comprobador[i].toString());
		}
		suma = suma/comprobador.length;
		return suma;
	}
	
}
