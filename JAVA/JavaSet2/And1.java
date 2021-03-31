import java.util.Scanner;
class And1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		System.out.println("Enter num2:");
		int n2 = sc.nextInt();
		if(n1<50 && n1<n2)
		{
			System.out.println("True");

		}
		else
		{
			System.out.println(" False");
		}
		
		
}
}