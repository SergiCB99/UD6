import java.util.Random;

import javax.swing.JOptionPane;

public class Ex11App {

	public static int [] generarArray () {
		
		//Pido el valor que quiere introducir en cada posicion
		String tamanyo_usuario = JOptionPane.showInputDialog("Introduce el tamanyo");
				
		//Paso los numeros a enteros
		int tamanyo = Integer.parseInt(tamanyo_usuario);
		
		int array[] = new int[tamanyo];
		
		return array;
		
	}
	
	public static int [] llenarArray (int [] array) {
		
		//Lleno el array de numeros entre el 1 y el 300
		for(int i=0;i<array.length;i++) {
				array[i] = 1 + (int)(Math.random() * ((300 - 1) + 1));
		}
		
		return array;
	}
	
	public static int[] arrayMultiplicaciones (int [] array1,int [] array2) {
		int [] array_multiplicaciones = new int [array1.length];
		
		//Recorro los dos arrays pasados por parametros para muliplicarlos y crear el array final
		for(int i=0;i<array1.length;i++) {
			array_multiplicaciones[i] = array1[i]*array2[i];
		}
		
		return array_multiplicaciones;
	}
	
	public static void imprimirArray (int [] array) {
		
		//Recorro todas las posiciones del array para mostrarlas
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Posicion "+i+" : "+array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] array1 = generarArray();
		
		array1 = llenarArray(array1);
		
		int [] array2 = array1;
		
		array2 = new int[array1.length];

		array2 = llenarArray(array2);	
		
		int [] array_multiplicaciones = arrayMultiplicaciones(array1,array2);
		
		System.out.println("Array1");
		imprimirArray(array1);
		System.out.println("Array2");
		imprimirArray(array2);
		
		System.out.println("Array Multiplicaciones");
		imprimirArray(array_multiplicaciones);
		
		
	}
	
}
