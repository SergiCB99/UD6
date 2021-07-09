import javax.swing.JOptionPane;

public class Ex9App {

	//Genera numeros aleatorios
	public static int numAleatorios (int max,int min) {
		int numAleatorio = min + (int)(Math.random() * ((max - min) + 1));
		
		return numAleatorio;
	}
	
	public static void imprimirArray (int [] array) {
		//Declaro y inicializo la variable que guardara la suma de todas las posiciones
		int suma = 0;
		
		//Recorro todas las posiciones del array para mostrarlas y sumarlos
		for(int i=0;i<array.length;i++) {
			System.out.println("Posicion "+i+" : "+array[i]);
			suma = suma+array[i];
		}
		
		//Muestro la suma
		System.out.println("Suma total "+suma);
		
	}
	
	public static void main(String[] args) {
		
		//Pido el valor que quiere introducir en cada posicion
		String tamanyo_usuario = JOptionPane.showInputDialog("Introduce el tamanyo");
		String min_usuario = JOptionPane.showInputDialog("Introduce el valor minimo");
		String max_usuario = JOptionPane.showInputDialog("Introduce el valor maximo");
		
		//Paso las variables a Integer
		int max = Integer.parseInt(max_usuario);
		int min = Integer.parseInt(min_usuario);
		int tamanyo = Integer.parseInt(tamanyo_usuario);
		
		//Creo y declaro el tamanyo del array
		int array[] = new int[tamanyo];
		
		//For que recorre y llena el array de valores aleatorios
		for(int i=0;i<array.length;i++) {
			array[i]=numAleatorios(max,min);
		}
		
		//Imprime el contenido del array y la suma de todos los valores
		imprimirArray(array);
		
	}
	
}
