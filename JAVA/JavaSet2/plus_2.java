import java.util.Scanner;
class plus_2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n = sc.nextInt();
		int first= n/1000;
		n=n%1000;
		int second = n/100;
		n=n%100;
		int third =n/10;
		int four =n%10;
		if(first==8)
			first=0;
		else if(first==9)
			first=1;
		else
			first+=2;
		if(second==8)
			second=0;
		else if(second==9)
			second=1;
		else
			second+=2;
		if(third==8)
			third=0;
		else if(third==9)
			third=1;
		else
			third+=2;
		if(four==8)
			four=0;
		else if(four==9)
			four=1;
		else
			four+=2;
		int res = (first*1000)+(second*100)+(third*10)+four;
		System.out.println(res);
	}
}





	