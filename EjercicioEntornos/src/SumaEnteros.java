import java.util.ArrayList;

public class SumaEnteros {
	public static void main(String [] args) {
		
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(13);
		numero.add(50);
		numero.add(30);
		numero.add(23);
		numero.add(503);
		System.out.println(sumatorio(numero));
	}
	
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
