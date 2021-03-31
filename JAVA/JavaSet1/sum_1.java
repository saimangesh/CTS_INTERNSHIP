import java.util.Scanner;
class sum_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		System.out.println("Enter num2:");
		double n2 = sc.nextDouble();
		double sum = n1+n2;
		String res = String.format("sum is %g",sum);
		System.out.println(res);
	}
}