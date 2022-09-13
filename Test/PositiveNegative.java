import java.util.Scanner;
class PositiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num= sc.nextInt();
		if(num>0){
			System.out.println(num+" is a positive number");
		}else{
			System.out.println(num+" is a negative number");
		}
		
	}
}