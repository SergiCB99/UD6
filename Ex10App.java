import javax.swing.JOptionPane;

public class Ex10App {

	public static int [] generarArray () {
		
		//Pido el valor que quiere introducir en cada posicion
		String tamanyo_usuario = JOptionPane.showInputDialog("Introduce el tamanyo");
				
		//Paso los numeros a enteros
		int tamanyo = Integer.parseInt(tamanyo_usuario);
		
		int array[] = new int[tamanyo];
		
		return array;
		
	}
	
	public static int [] llenarArray (int max,int min,int [] array) {
		
		
		for(int i=0;i<array.length;i++) {
			//Do para controlar que solo introduzca numeros primos
			do {
				array[i] = min + (int)(Math.random() * ((max - min) + 1));
			}while(esPrimo(array[i]) == false);
		}
		
		return array;
	}
	
	public static void imprimirArray (int [] array) {
		
		//Recorro todas las posiciones del array para mostrarlas
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Posicion "+i+" : "+array[i]);
		}
		
	}
	
	public static void mayor (int [] array) {
		int mayor = 0;
		int posicion_mayor = 0;
		
		//For que recorre todo el array para encontrar el valor mas grande
		for(int i=0;i<array.length;i++) {
			if(array[i]>mayor) {
				mayor = array[i];
				posicion_mayor=i;
			}
		}
		
		System.out.println("El numero mas grande es "+mayor+" y esta en la posicion "+posicion_mayor);
		
	}
	
	public static boolean esPrimo (int num) {
		//Declaro y inicializo el booleano que devolvere
		boolean es_primo = true;
		
		//For para calcular si el numero es primo
		for(int i=2;i<num;i++) {
			if((num%i) == 0) {
				es_primo = false;
			}
		}
		
		return es_primo;
	}
	
	public static void main(String[] args) {
		
		int [] array = generarArray();
		
		//Pido el rango minimo y minimo
		String min_usuario = JOptionPane.showInputDialog("Introduce el valor minimo");
		String max_usuario = JOptionPane.showInputDialog("Introduce el valor maximo");
		
		//Paso las variables a Integer
		int max = Integer.parseInt(max_usuario);
		int min = Integer.parseInt(min_usuario);
	
		//Lleno el array de numeros primos
		llenarArray(max,min,array);
		
		imprimirArray(array);
		
		//Muestro el valor mas alto y su posicion
		mayor(array);
		
	}
	
}
