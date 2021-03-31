import java.util.Scanner;
class rev_num
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		int rev=0,s=0;
		while(n1>0)
		{
			s= n1%10;
			rev=rev*10+s;
			n1=n1/10;
		}
		System.out.println(rev);
	}
}
