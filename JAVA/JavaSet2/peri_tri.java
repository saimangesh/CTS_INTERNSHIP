import java.util.Scanner;
class peri_tri
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side1:");
		int s1 = sc.nextInt();
		
		System.out.println("Enter side2:");
		int s2 = sc.nextInt();

		System.out.println("Enter side3:");
		int s3 = sc.nextInt();

		int peri = s1+s2+s3;
		String res1 = String.format("area is %d",peri);

		System.out.println(res1);

		}
}