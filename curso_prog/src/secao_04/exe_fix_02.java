package secao_04;
import java.util.Scanner;

public class exe_fix_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*String x;
		x = sc.next();
		
		int y;
		y = sc.nextInt();
		
		double z;
		z = sc.nextDouble();
				
		char a;
		a = sc.next().charAt(0);
		
		System.out.printf("A palavra que você digitou foi: %s%n", x);
		System.out.printf("O número inteiro que você digitou foi: %d%n", y);
		System.out.printf("O número double que você digitou foi: %.2f%n", z);
		System.out.printf("A letra que você digitou foi: %c%n", a);
		*/
		
		int h;
		String x1;
		
		h = sc.nextInt();
		sc.nextLine();
		x1  = sc.nextLine();
		
		System.out.println("Dados");
		System.out.println(h);
		System.out.println(x1);
		
		sc.close();
	}

}
