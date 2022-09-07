import java.util.Scanner;

public class Ejercicio2 extends Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner inData = new Scanner(System.in);
		int p1, p2, res = 0;
		
		System.out.print("Ingrese el valor de n: ");
		int pos = inData.nextInt();
		
		for(int i = 1; i <= pos; i++)
		{
			if (i < pos)
			{
			System.out.print(i + " + ");	
			}
			else 
			{
			System.out.print(i + " = ");	
			}
			res += i;
		}
		System.out.print("(" + pos + " * (" + pos + " + 1)) / 6");
		p1 = res;
		p2 = (pos * (pos + 1) / 2);
		System.out.println("\n\n" + p1 + " = " + p2);
		
		inData.close();
	 }
}
