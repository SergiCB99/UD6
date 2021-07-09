import javax.swing.JOptionPane;

public class Ex7App {

	public static void canvioMoneda (double cantidad,String moneda) {
		
		//Switch que dependiendo de la moneda introducida calculara y mostrara diferentes mensajes
		switch(moneda) {
			case "Libras":
				JOptionPane.showMessageDialog(null,cantidad+" Euros son "+(0.86*cantidad)+" Libras");	
			break;
			case "Dolares":
				JOptionPane.showMessageDialog(null,cantidad+" Euros son "+(1.28611*cantidad)+" Dolares");
			break;
			case "Yenes":
				JOptionPane.showMessageDialog(null,cantidad+" Euros son "+(129.852*cantidad)+" Yenes");
			break;
			//Por si introduce algo que no cumpla con nada de lo anterior
			default:
				System.out.println("Introduce un valor valido");
		}
		
	}
	
	public static void main(String[] args) {
		
		//Pido la moneda a la que quiere pasar
		String moneda = JOptionPane.showInputDialog("Introduce a que moneda quieres pasar");
		
		//Pido la cantidad de dinero
		String cantidad_usuario = JOptionPane.showInputDialog("Introduce la cantidad");
		
		//Lo paso a Double y lo guardo en la variable
		double cantidad = Double.parseDouble(cantidad_usuario);
				
		//Llamo al metodo
		canvioMoneda(cantidad,moneda);
		
	}
	
}
