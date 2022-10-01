import java.util.Scanner;

public class Factoriales2 {
static Scanner factor = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Ingrese un número para calcular factorial: ");
		int factorial = factor.nextInt();
		int numero = factorial;
		int resultado = 1;
		if(factorial > 0) {
		while (factorial != 0)
		{
			resultado = resultado * factorial;
			factorial = factorial - 1;
		}
		System.out.println("El factorial de " + numero + " es = " + resultado);
		}
		
		else if (factorial == 0)
		{
			System.out.println("El factorial de 0 es 1.");
		}
		else if (factorial <0)
			System.out.println("El número ingresado no es válido.");
	}

}
