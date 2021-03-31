import java.util.Scanner;
class final_res_ass
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		n1+=8;
		n1%=5;
		n1*=5;
		String res_s = String.format("final answer is %d",n1);
		System.out.println(res_s);
}
}