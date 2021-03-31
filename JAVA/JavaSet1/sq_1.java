import java.util.Scanner;
class sq_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		double n1 = sc.nextDouble();
		double sq = n1*n1;
		String res = String.format("square is %g",sq);
		System.out.println(res);
	}
}