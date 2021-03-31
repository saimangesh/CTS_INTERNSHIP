import java.util.Scanner;
class pro_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		System.out.println("Enter num2:");
		int n2 = sc.nextInt();
		System.out.println("Enter num3:");
		int n3 = sc.nextInt();


		int product = n1*n2*n3;
		String res = String.format("product is %d",product);
		System.out.println(res);
		}
}