import java.util.Scanner;
import java.lang.Math;
class power_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		double n1 = sc.nextDouble();
		System.out.println("Enter num2:");
		double n2 = sc.nextDouble();
		double power = Math.pow(n1,n2);
		String res = String.format("Power is %g",power);
		System.out.println(res);
		
		
}
}