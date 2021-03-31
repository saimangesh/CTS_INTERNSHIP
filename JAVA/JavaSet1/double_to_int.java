import java.util.Scanner;
class double_to_int
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Double num:");
		double d = sc.nextDouble();
		int i =(int) d;
		String res = String.format("Converted integer is %d",i);
		System.out.println(res);
	}
}