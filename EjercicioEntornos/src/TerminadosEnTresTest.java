import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TerminadosEnTresTest {

	@Test
	public void testTerminadosTres() {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(0);
		numero.add(0);
		numero.add(0);
		numero.add(0);
		numero.add(0);

		int resultado = TerminadosEnTres.verTerminaTres(numero);
		assertEquals(resultado,0);
	}
}
