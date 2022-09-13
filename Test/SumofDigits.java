import java.util.Scanner;
class SumofDigits{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num= sc.nextInt();
		int n=num;
		int sum=0;
		while(num>0){
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The sum of digits of "+n+" is=" +sum);
	}
}