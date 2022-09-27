import java.util.Scanner;
import java.lang.Math;

public class prog3 {
public static void main(String[] args) {
int option;
double radius, circumference,area;
Scanner sc=new Scanner (System.in);
System.out.println("******Menu******");
System.out.println("1.Calculate Area of Circle");
System.out.println("2.Calculate Circumference of a Circle");
System.out.println("3.Exit");
System.out.println("Enter your choice");
option=sc.nextInt();

switch(option)
{
case 1:
System.out.print("Enter radius:");
radius=sc.nextInt();
area=(Math.PI*(radius*radius));
System.out.println("Area of Circle is:"+area);
break;
case 2:
System.out.print("Enter radius:");
radius=sc.nextInt();
circumference=2*3.17*radius;
System.out.println("Circumference of a Circle is:"+circumference);
break;
case 3:
exit();
break;
default:System.out.println("Invalid Choice");
}
sc.close();
}
private static void exit() {
}
}
