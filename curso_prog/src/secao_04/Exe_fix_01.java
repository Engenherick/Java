package secao_04;
import java.util.Locale;

public class Exe_fix_01 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.5;
		double measure = 53.234567;

		System.out.printf("Produtos:%n%s, com preço de R$%.2f%n", produto1, preco1);
		System.out.printf("%s, com preço de R$%.2f%n%n", produto2, preco2);
		System.out.printf("Record: %d anos de idade, código %d e genero: %s%n%n", age, code, gender);
		System.out.printf("measure with eiht decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);

		Locale.setDefault(Locale.US);

		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
