import java.util.Scanner;
public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola, ponle tu nombre amig@"); // salida del sistema un texto que ve el usuario
		String EntradaTeclado = " "; //declaramos la variable a leer y le ponemos un valor temporal
		Scanner EntradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner, le ponemos new porque viene de Fuera no es un comando basico es de importacion
		EntradaTeclado = EntradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner, el line es por que es texto, el nextin es para enteros
		System.out.println ("Bienveido " + EntradaTeclado );

	}
	
	//metodo saludo
	public static String saludo(String sal)

}
