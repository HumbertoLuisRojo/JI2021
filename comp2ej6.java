import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class ListaEmpleados {
	public static void main(String[] args) {
 
		//Inicializar HashSets 
		Set<String> nombre_y_Apellido = new HashSet<>();
   		Set<Long> documento = new HashSet<Long>();
   		Set<Long> horas_Trabajadas = new HashSet<Long>();
   		Set<Long> valor_Por_Hora = new HashSet<Long>

   		//Inicializar HashMaps 
       	Map<Integer, Integer> empleado = new HashMap<Integer, Integer>(); 

		// Operaciones de Inserción
		nombre_y_Apellido.add("Tinky Winky");
		documento.add(Long.valueOf(1234321));
		horas_Trabajadas.add(Long.valueOf(160));
		valor_Por_Hora.add(Long.valueOf(250));
		//
		nombre_y_Apellido.add("Dipsy");
		documento.add(Long.valueOf(9876789));
		horas_Trabajadas.add(Long.valueOf(180));
		valor_Por_Hora.add(Long.valueOf(380));
		//
		nombre_y_Apellido.add("Laa-Laa");
		documento.add(Long.valueOf(1357531));
		horas_Trabajadas.add(Long.valueOf(210));
		valor_Por_Hora.add(Long.valueOf(120));
		//
		nombre_y_Apellido.add("Po");
		documento.add(Long.valueOf(2468642));
		horas_Trabajadas.add(Long.valueOf(155));
		valor_Por_Hora.add(Long.valueOf(250));
		//
       	for (String nombre: nombre_y_Apellido, int horasT: horas_Trabajadas, int valorH: valor_Por_Hora, int dni: documento) { 
       		sueldo = horasT * valorH;
       		System.out.println("El sueldo de " + nombre + " es: $" + sueldo);
       		empleado.put(dni, sueldo);
        }
 
   }
}