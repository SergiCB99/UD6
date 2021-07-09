import javax.swing.JOptionPane;

public class Ex4App {

	public static int factorial (int num) {
		//Declaro y inicializo la variable que guardara el resultado
		int resultado = 1;
		
		//While para calcular el factorial
		while (num != 0){
			resultado = resultado * num;
			
			num--;
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		
		//Declaro la variable que guardara el return
		int resultado;
		
		//Pido el numero al usuario
		String num_usuario = JOptionPane.showInputDialog("Introduce el numero");
		
		//Lo paso a Integer
		int num = Integer.parseInt(num_usuario);
		
		//Guardo el return
		resultado = factorial(num);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"El factorial de "+num+" es "+resultado);
		
	}
	
}
