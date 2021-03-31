import java.util.Scanner;
class Ascii_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char c = sc.next().charAt(0);
		int i = (int) c ;
		String res = String.format("Ascii of given Character is %d",i);
		System.out.println(res);


	}
}