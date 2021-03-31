import java.util.Scanner;
class fahCelsius
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit:");
		double f_temp = sc.nextDouble();
		f_temp=f_temp-32;
		double c_temp = ((float)5/9)*f_temp;
		System.out.println(c_temp);
	}
}