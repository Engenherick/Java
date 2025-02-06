package secao_04;
import java.lang.Math;
import java.util.Scanner;

public class exe_fix_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Digite os valores de a, b, c, respectivamente:");
		System.out.print("a:");
		a = sc.nextInt();
		System.out.print("b:");
		b = sc.nextInt();
		System.out.print("c:");
		c = sc.nextInt();
		
		double delta, x1, x2;
		
		delta = Math.pow(b, 2.0) - (4.0 * a * c);
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f", x1, x2);
		
		sc.close();
	}

}
