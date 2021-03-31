import java.util.Scanner;
class swap_nums
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int a = sc.nextInt();
		System.out.println("Enter num2:");
		int b = sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}}