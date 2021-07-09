import javax.swing.JOptionPane;

public class Ex8App {

	public static int[] rellenarArray () {
		//Creo el array
		int array[] = new int[10];
		
		for(int i=0;i<array.length;i++) {
			//Pido el valor que quiere introducir en cada posicion
			String valor_usuario = JOptionPane.showInputDialog("Introduce el valor");
			
			//Lo paso a Integer y lo guardo en la variable
			int valor = Integer.parseInt(valor_usuario);
			
			//Asigno el valor a la posicion del array
			array[i] = valor;
		}
		
		return array;
	}
	
	public static void imprimirArray (int [] array) {
		
		//Recorro todas las posiciones del array para mostrarlas
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Posicion "+i+" : "+array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		//Declaro y lleno el array
		int array[] = rellenarArray();
		
		//Imprimo el array
		imprimirArray(array);
		
	}
	
}
