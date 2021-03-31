import java.util.Scanner;
class sum_digits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		int sum=0;
		int s;
		while(n1>0)
		{
			s=n1%10;
			sum=sum+s;
			n1=n1/10;
		}
		System.out.println(sum);
	}
}