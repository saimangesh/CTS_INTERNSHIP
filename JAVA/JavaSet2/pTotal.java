import java.util.Scanner;
class pTotal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		System.out.println("Enter num2:");
		int n2 = sc.nextInt();
		System.out.println("Enter num3:");
		int n3 = sc.nextInt();

		int total= n1+n2+n3;
		int  per = (total*100)/300;
		System.out.println(total);
		System.out.println(per);
		
}
}