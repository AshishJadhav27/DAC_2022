import java.util.Scanner;
class SwitchCase{
public static void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any no");
	int day=sc.nextInt();
switch(day){
case 1:
 System.out.println("Today is Monday");
case 2:
 System.out.println("Today is Tuesday");
case 3:
 System.out.println("Today is Wednesday");
case 4:
 System.out.println("Today is Thursday");
case 5:
 System.out.println("Today is Friday");
case 6:
 System.out.println("Today is Saturday");
case 7:
 System.out.println("Today is Sunday");
}
default:
Sytem.out.println("Invalid input"); 
}
}