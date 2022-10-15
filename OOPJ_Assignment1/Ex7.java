import java.util.Scanner;
class Ex7{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first no=");
	  int a= sc.nextInt();
	  System.out.println("Enter second no=");
	  int b= sc.nextInt();
	  
	  int add = MathOperation.addition(a,b);
	  int sub = MathOperation.substraction(a,b);
	  int multi = MathOperation.multiply(a,b);
	  int pow = MathOperation.power(a,b);
	  
	  System.out.println();
	  System.out.println("Addition of "+a+" & "+b+" is "+add);
	  System.out.println("Substraction of "+a+" & "+b+" is "+sub);
	  System.out.println("Multiplication of "+a+" & "+b+" is "+multi);
	  System.out.println("Power of "+a+" to the "+b+" is "+pow);
	}
}
	class MathOperation{
		int a;
		int b;
   
		static int addition(int a, int b){
			int add = a+b;
			return add;
		}
	
		static int substraction(int a, int b){
			int sub= a-b;
			return sub;
		}
	
		static int multiply(int a, int b){
		 int multi= a*b;
		 return multi;
		}
	
		static int power(int a, int b){
		int pow= (int) Math.pow(a,b);
		return pow;
		}
}