import java.io.*;

public class comp1ej8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String ciudad;
		String dire;
		String edad;
		String nya;
		// Crear una aplicaci�n que solicite de entrada los datos de una persona en este orden:
		// Nombre y Apellido
		// Edad
		// Direcci�n
		// Ciudad
		// Luego imprimir� el siguiente mensaje:
		// {Ciudad} - {Direcci�n} - {Edad} - {Nombre y Apellido}
		System.out.println("Ingrese nombre y apellido");
		edad = bufEntrada.readLine();
		System.out.println("Ingrese edad");
		nya = bufEntrada.readLine();
		System.out.println("Ingrese direcci�n");
		dire = bufEntrada.readLine();
		System.out.println("Ingrese ciudad");
		ciudad = bufEntrada.readLine();
		System.out.println(ciudad+" - "+dire+" - "+edad+" - "+nya);
	}


}

