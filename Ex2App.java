import javax.swing.JOptionPane;

public class Ex2App {

	//Genera un numero entero entre el intervalo indicado
	public static int numAleatorios (int max,int min) {
		int numAleatorio = min + (int)(Math.random() * ((max - min) + 1));
		
		return numAleatorio;
	}
	
	public static void main(String[] args) {
		
		//Variable que guardara el numero generado
		int numAleatorio;
		
		//Pido todo lo necesario
		String cantidad_usuario = JOptionPane.showInputDialog("Quantos numeros quieres");
		String min_usuario = JOptionPane.showInputDialog("Introduce el valor minimo");
		String max_usuario = JOptionPane.showInputDialog("Introduce el valor maximo");
		
		//Paso los numeros a enteros
		int cantidad = Integer.parseInt(cantidad_usuario);
		int max = Integer.parseInt(max_usuario);
		int min = Integer.parseInt(min_usuario);
		
		//Bucle for para mostrar tantos numero como el usuario haya pedido
		for(int i = 1;i<=cantidad;i++) {
			
			//Guardo el numero aleatorio
			numAleatorio = numAleatorios(max,min);
			
			//Mestro el numero generado
			JOptionPane.showMessageDialog(null,i+" : "+numAleatorio);		
		}
		
	}
	
}
