import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SumaEnterosTest {

	@Test
	void testSumatorioNumerosPositivos() {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(10);
		numero.add(10);
		numero.add(10);
		numero.add(10);
		numero.add(10);
		int resultado = SumaEnteros.sumatorio(numero);
		assertEquals(resultado,10);
	}
	
	@Test
	void testSumatorioNumerosNegativos() {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(-3);
		numero.add(-4);
		numero.add(-8);
		numero.add(-5);
		numero.add(-10);
		int resultado = SumaEnteros.sumatorio(numero);
		assertEquals(resultado,-6);
	}

}
