import java.io.*;
public class ContarA {
	
	int numeroA;
	
	public int getNumeroA() {
		return numeroA;
	}
	
	ContarA(String cadena) {
		numeroA = 0;
		for(int i = 0; i < cadena.length(); i++) {
			if((cadena.charAt(i) == 'a') || cadena.charAt(i) == 'A')
				numeroA++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		System.out.print("Introduce una cadena de caracteres: ");
		cadena = leerTeclado.readLine();
		ContarA contarA = new ContarA(cadena);
		System.out.print("El numero de caracteres a o A es : " + contarA.getNumeroA());

	}

}
