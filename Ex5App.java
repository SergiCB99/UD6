import javax.swing.JOptionPane;

public class Ex5App {

	public static String aBinario (int num) {
		//Declaro y inicializo la variable que guardara el resultado
		String binario = "";
		
		//While para calcular el numero binario
		while (num!=0) {
			if(num%2==1) {
				binario = "1"+binario;
			}else {
				binario="0"+binario;
			}
			
			num = num/2;
		}
		
		return binario;
	}
	
	public static void main(String[] args) {
		
		//Declaro la variable que guardara el numero binario
		String resultado;
		
		//Pido el numero
		String num_usuario = JOptionPane.showInputDialog("Introduce el numero");
		
		//Lo paso a Integer
		int num = Integer.parseInt(num_usuario);
		
		//Guardo el return
		resultado = aBinario(num);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"El binario de "+num+" es "+resultado);
		
	}
	
}
