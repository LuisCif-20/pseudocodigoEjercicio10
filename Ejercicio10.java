import java.util.*;
public class Ejercicio10{
	public static void main(String[] args) {
		int total = 0;
		int mult6 = 0;
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		do {
			int numentrado;
			System.out.println("Ingrese un numero");
			numentrado = scan.nextInt();
			total += numentrado;
			int mult = numentrado%6;
			if (mult == 0) {
				mult6++;
			}
			if (numentrado >= 1 & numentrado <= 10) {
				cont += numentrado;
			}
		} while (total < 1000);
		System.out.println("La suma de los numeros ingresados es " + total);
		System.out.println("Se ingresaron " + mult6 + " multiplos de 6");
		System.out.println("La suma de los numeros que se encuentran entre 1 y 10 es " + cont);
	}
}