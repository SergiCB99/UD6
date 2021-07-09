import javax.swing.JOptionPane;

public class Ex12App {

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
	
	public static int numeroBuscar () {
		
		int numero_buscar = 0;
		
		//Controlo que sea un valor valido
		do {
			
		//Pido el valor que quiere buscar
		String numero_buscar_usuario = JOptionPane.showInputDialog("Introduce el numero que quieres buscar");
								
		//Paso el numero a Integer
		numero_buscar = Integer.parseInt(numero_buscar_usuario);
		
		}while(numero_buscar<0 && numero_buscar>=10);	
		
		return numero_buscar;
	}
	
	public static int [] llenarArrayBusqueda (int [] array,int numero_buscar) {
		
		//Creo y inicializo el array en el que guardare los numeros que busco
		int [] arrayBusqueda = new int [array.length];
		
		//Este contador sirve para que en el arrayBusqueda guardar en posiciones seguidas
		int contador=0;
		
		
		for(int i=0;i<array.length;i++) {
			//Si el resto coincide con el numero que busco se guarda en el arrayBusqueda
			if(array[i]%10 == numero_buscar) {
				arrayBusqueda[contador]=array[i];
				contador++;
			}
		}
		
		return arrayBusqueda;
		
	}
	
	public static void imprimirArray (int [] array) {
		
		//Recorro todas las posiciones del array para mostrarlas
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Posicion "+i+" : "+array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] array = generarArray();

		array = llenarArray(array);

		System.out.println("Array");
		imprimirArray(array);
		
		int numero_buscar = numeroBuscar();
		
		int [] arrayBusqueda = llenarArrayBusqueda(array,numero_buscar);
		
		System.out.println("Array  Busqueda");
		imprimirArray(arrayBusqueda);
		
	}
	
}
