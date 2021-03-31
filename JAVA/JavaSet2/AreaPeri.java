import java.util.Scanner;
class AreaPeri
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int l = sc.nextInt();
		
		System.out.println("Enter breadth:");
		int b = sc.nextInt();

		int area = l*b;
		int peri = 2*(l+b);
		String res = String.format("area is %d",area);
		String res1 = String.format("area is %d",peri);

		System.out.println(res);
		System.out.println(res1);

		}
}