import java.util.Scanner;
class finalResult
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		n1=n1+8;
		int m = n1%5;
		int res= m*5;
		String res1 = String.format("final answer is %d",res);
		System.out.println(res1);
	}
}
