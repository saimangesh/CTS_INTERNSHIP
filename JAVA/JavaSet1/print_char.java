import java.util.Scanner;
class print_char
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		float f = sc.nextFloat();
		char c = sc.next().charAt(0);
		double d= sc.nextDouble();
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(d);
	}
}