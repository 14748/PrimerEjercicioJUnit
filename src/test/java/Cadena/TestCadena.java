package Cadena;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCadena {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void devolverLongitud() {
		Cadena target = new Cadena();
		int expected = 6;
		int actual = target.longitud("pepito");
		assertEquals("Longuitud de la cadena", expected, actual);
	}
	
	@Test
	public void devolverNumeroVocales() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("pepito");
		assertEquals("Numero de vocales", expected, actual);
	}
	
	@Test
	public void devolverStringInverso() {
		Cadena target = new Cadena();
		String expected = "otipep";
		String actual = target.invertir("pepito");
		assertEquals("String inverso", expected, actual);
	}
	
	@Test
	public void devolverNumeroRepeticonesChar() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.contarLetra("pepitoee", 'e');
		assertEquals("Numero de veces que existe char en string", expected, actual);
	}

}
