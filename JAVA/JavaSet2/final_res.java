import java.util.Scanner;
class final_res
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		n1=n1+8;
		int m = n1%5;
		int res= m*5;
		String res_s = String.format("final answer is %d",res);
		System.out.println(res_s);
}
}