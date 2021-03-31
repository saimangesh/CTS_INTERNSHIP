import java.util.Scanner;
class sum_fd_ld
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int a = sc.nextInt();
		int fd=a/10000;
		int ld=a%10;
		int sum= fd+ld;
		System.out.println(sum);
	}
}