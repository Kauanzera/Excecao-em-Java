import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Controle_Fluxo {
	public static void main(String[] args) {
	
		try {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura;
		int idade;
		String sobrenome, nome;
		
		System.out.print("Informe seu nome: ");
		nome = sc.next();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = sc.next();
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
		System.out.print("Informe sua altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("Olá, me chamo %s %s, tenho %d anos e possuo %.2fm de altura!", nome.toUpperCase(), sobrenome.toUpperCase(), idade, altura);
		
		sc.close();
		} 
		catch(InputMismatchException e) {
			System.err.println("Os campos 'Idade' e 'Altura' devem ser informados apenas com números!");
		}
	}
}
