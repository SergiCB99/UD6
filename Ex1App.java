import javax.swing.JOptionPane;

public class Ex1App {
	
	//Calcula el area del Circulo
	public static double areaCirculo (double radio) {
		double areaCirculo = 3.14*Math.pow(radio,2);
		
		return areaCirculo;
	}
	//Calcula el area del Cuadrado
	public static double areaCuadrado (double lado) {
		double areaCuadrado = Math.pow(lado,2) ;
		
		return areaCuadrado;
	}
	//Calcula el area del Triangulo
	public static double areaTriangulo (double base,double altura) {
		double areaTriangulo = (base*altura)/2;
		
		return areaTriangulo;
	}
	
	public static void main(String[] args) {
		
		//Declaro la variable en la que guardare los returns
		double area;
		
		//Declaro y lleno la variable figura
		String figura = JOptionPane.showInputDialog("Introduce que figura quieres calcular");
		
		//Switch que dependiendo de la figura introducida pedira y llamara diferentes cosas
		switch(figura) {
		case "Circulo":
			String radio_usuario = JOptionPane.showInputDialog("Introduce el radio");
			double radio = Double.parseDouble(radio_usuario);
			
			area = areaCirculo(radio);
			
			JOptionPane.showMessageDialog(null,"Area del ciruculo "+area);
			
		break;
		case "Cuadrado":
			String lado_usuario = JOptionPane.showInputDialog("Introduce un lado");
			double lado = Double.parseDouble(lado_usuario);
			
			area = areaCuadrado(lado);
			
			JOptionPane.showMessageDialog(null,"Area del cuadrado "+area);
			
		break;
		case "Triangulo":
			String base_usuario = JOptionPane.showInputDialog("Introduce la base");
			String altura_usuario = JOptionPane.showInputDialog("Introduce la altura");
			
			double base = Double.parseDouble(base_usuario);
			double altura = Double.parseDouble(altura_usuario);
			
			area = areaTriangulo(base,altura);
			
			JOptionPane.showMessageDialog(null,"Area del triangulo "+area);
			
		break;
		//Por si introduce algo que no cumpla con nada de lo anterior
		default:
			System.out.println("Introduce un valor valido");
	}
		
	}
	
}
