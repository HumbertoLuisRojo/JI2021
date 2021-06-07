import java.io.*;

public class comp2ej2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cc;
		int elemento;
		int i;
		int num[];
		int num2[];
		int num3;
		int tamano;
		int tamaño;
		String vector_ciudad;
		// Crear un ArrayList, agregar 5 números enteros. 
		// Luego, agregar un número entero al principio de la lista y otro al final. 
		// Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma 
		// (antes y después de agregar a en la primera y última posición).
		// Declaramos variables
		tamano = 5;
		// Definimos el array
		num = new int[tamano];
		cc = 1;
		// Asignamos valores 
		while (cc<=tamano) {
			System.out.println("Ingrese el elemento de orden "+cc);
			elemento = Integer.parseInt(bufEntrada.readLine());
			num[cc-1] = elemento;
			cc = cc+1;
		}
		cc = cc-1;
		System.out.println("El tamaño del arreglo es: "+cc);
		num2 = new int[tamano+2];
		cc = 1;
		System.out.println("Ingrese el elemento de orden "+cc);
		elemento = Integer.parseInt(bufEntrada.readLine());
		num2[cc-1] = elemento;
		cc = cc+1;
		while (cc<=(tamano+1)) {
			num2[cc-1] = num[cc-2];
			cc = cc+1;
		}
		System.out.println("Ingrese el elemento de orden "+cc);
		elemento = Integer.parseInt(bufEntrada.readLine());
		num2[cc-1] = elemento;
		System.out.println("El tamaño del arreglo es: "+cc);
		// Recorremos el array y mostramos su contenido
		for (i=1;i<=(cc);i++) {
			System.out.println("#"+i+"-"+num2[i-1]);
		}
	}


}

