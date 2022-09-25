import java.util.Scanner;
class Swapping{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number for A");
int a = sc.nextInt();
System.out.println("Enter a number for B");
int b = sc.nextInt();

a=a+b;
b=a-b;
a=a-b;

System.out.println("A= "+a);
System.out.println("B= " +b);
}
}