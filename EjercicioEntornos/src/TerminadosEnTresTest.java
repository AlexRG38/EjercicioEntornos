import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TerminadosEnTresTest {

	@Test
	public void testNumerosCero() {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(0);
		numero.add(0);
		numero.add(0);
		numero.add(0);
		numero.add(0);

		int resultado = TerminadosEnTres.verTerminaTres(numero);
		assertEquals(resultado,0);
	}
	
	@Test
	public void testProcedimientoNormal() {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(3);
		numero.add(13);
		numero.add(50);
		numero.add(43);
		numero.add(10);

		int resultado = TerminadosEnTres.verTerminaTres(numero);
		assertEquals(resultado,3);
	}
}
