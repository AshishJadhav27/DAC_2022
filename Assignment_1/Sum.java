import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no:");
		int num= sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++){
			sum=sum+i;
			
			
		}
		System.out.println("Sum of first "+num+" natural numbers is "+sum);
	}
}