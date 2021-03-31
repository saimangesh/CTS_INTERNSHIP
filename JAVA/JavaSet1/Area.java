import java.util.Scanner;
class Area
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int l = sc.nextInt();
		
		System.out.println("Enter breadth:");
		int b = sc.nextInt();

		int area = l*b;
		String res = String.format("area is %d",area);
		System.out.println(res);
		}
}