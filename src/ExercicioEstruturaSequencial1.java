import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, 
 * e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos.
 * */

public class ExercicioEstruturaSequencial1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1,valor2, soma;
		
		valor1=sc.nextInt();
		valor2=sc.nextInt();
		soma=valor1+valor2;
		
		System.out.println("Soma = "+ soma);
		
		
		sc.close();
		

	}

}
