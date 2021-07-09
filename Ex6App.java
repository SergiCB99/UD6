import javax.swing.JOptionPane;

public class Ex6App {

	public static int contarCifras (int num) {
		int cifras = 1;
		
		while(num>0) {
			if(num/10 != 0) {
				cifras = cifras+1;
			}
			num = num/10;
		}
		
		return cifras;
	}
	
	public static void main(String[] args) {
		
		//Declaro la variable que guardara el numero de cifras y el numero del usuario
		int resultado;
		int num;
		
		
		//While que controla que en numero sea positivo
		do {
			//Pido el numero
			String num_usuario = JOptionPane.showInputDialog("Introduce el numero");
			
			//Lo paso a Integer y lo guardo en la variable
			num = Integer.parseInt(num_usuario);
		
		}while(num<0);
		
		//Guardo el return
		resultado = contarCifras(num);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,num+" tiene "+resultado+" cifras");
		
	}
	
}
