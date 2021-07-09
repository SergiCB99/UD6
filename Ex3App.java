import javax.swing.JOptionPane;

public class Ex3App {

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
		
		//Declaro la variable que guardara el return
		boolean es_primo;
		
		//Declaro y lleno la variable en la que guardare el numero
		String num_usuario = JOptionPane.showInputDialog("Introduce el numero");
		
		//Lo paso a int
		int num = Integer.parseInt(num_usuario);
		
		//Guardo el return
		es_primo = esPrimo(num);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"El numero "+num+" es primo? "+es_primo);
		
	}
	
}
