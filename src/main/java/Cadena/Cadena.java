package Cadena;

public class Cadena {
	private static final char[] vocalesArray = {'a', 'e', 'i', 'o', 'u'};
	public Cadena() {}
	
	public int longitud(String cadena)
	{
		return cadena.length();
	}
	
	public int vocales(String cadena)
	{
		int numeroVocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < vocalesArray.length; j++) {
				if (cadena.charAt(i) == vocalesArray[j]) {
					numeroVocales++;
				}
			}
		}
		return numeroVocales;
	}
	
	public String invertir(String cadena)
	{
		String nuevoString = "";
		for (int i = cadena.length() - 1; i >= 0 ; i--) {
			nuevoString += cadena.charAt(i);
		}
		return nuevoString;
	}
	
	public int contarLetra(String cadena, char caracter)
	{
		int numeroRepeticiones = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				numeroRepeticiones++;
			}
		}
		return numeroRepeticiones;
		
	}
}
