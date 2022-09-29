package java2;
import java.util.Scanner;

public class Banking {

public static void main(String[] args) {
SBI s=new SBI();
BOI b=new BOI();
ICICI i=new ICICI();
Banks bank=new Banks();
 Scanner scan=new Scanner(System.in);
 int option='\0';
 int Salary;
 char c;
 System.out.println("................Welcome to Banking System.................");
 

 
 System.out.println(".....................Select ypur Bank.....................");
 System.out.println("1.  SBI!!");
 System.out.println("2.  BOI!!");
 System.out.println("3.  ICICI!!");
 
 do {
  option = scan.nextInt();
  switch (option) {
  
  case 1:
   System.out.println("Welcome to SBI Bank");
   System.out.println("Name: "+bank.getName());
   System.out.println("Account Number: "+bank.getAccountNo());
   System.out.println("Salary: "+bank.getsalary());
   System.out.println("What would you like to do?");
   System.out.println("Deposit press 'D'");
   System.out.println("Withdraw press 'W'");
   System.out.println("Check for log 'L'");
   System.out.println("Exit press 'E'");
   do {
   c = scan.next().charAt(0);
   switch (c) {
   case 'D':
    System.out.printf("Enter amount you want to deposit: ");
    Salary = scan.nextInt();
    s.deposit(Salary);
    System.out.println("Your Updated Amount is: " + s.deposit(Salary));
    break;
   case 'W': 
    System.out.printf("Enter Withdrawn amount : ");
    Salary = scan.nextInt();
    s.withDrawl(Salary);
    System.out.println("Your Updated Amount is : " + s.withDrawl(Salary));
    break;
   case 'L':
    s.log();
   case 'E':
    System.out.println("Exit");
    break;
   default:
    System.out.println("Wrong Input!");
    break;
   }
   }while (c!='E');
   break;
case 2:
   System.out.println("Welcome to Bank of India");
   System.out.println("Name: "+bank.getName());
   System.out.println("Account Number: "+bank.getAccountNo());
   System.out.println("Salary: "+bank.getsalary());
   System.out.println("What would you like to do?");
   System.out.println("Deposit press 'D'");
   System.out.println("Withdraw press 'W'");
   System.out.println("Check for log 'L'");
   System.out.println("Exit press 'E'");
   do {
   c = scan.next().charAt(0);
   switch (c) {
   case 'D':
    System.out.printf("Enter deposit amount : ");
    Salary = scan.nextInt();
    b.deposit(Salary);
    System.out.println("Your Updated Amount is : " + b.deposit(Salary));
    break;
   case 'W': 
    System.out.printf("Enter Withdrawn amount : ");
    Salary = scan.nextInt();
    b.withDrawl(Salary);
    System.out.println("Your Updated Amount is : " + b.withDrawl(Salary));
    break;
   case 'L':
    b.log();
   case 'E':
    System.out.println("Exit");
    break;
   default:
    System.out.println("Wrong Input!");
    break;
   }
   }while (c!='E');
   break;
   
  case 3:
   System.out.println("Welcome to ICICI Bank");
   System.out.println("Name: "+bank.getName());
   System.out.println("Account Number: "+bank.getAccountNo());
   System.out.println("Salary: "+bank.getsalary());
   System.out.println("What would you like to do?");
   System.out.println("Deposit press 'D'");
   System.out.println("Withdraw press 'W'");
   System.out.println("Check for log 'L'");
   System.out.println("Exit press 'E'");
   do {
   c = scan.next().charAt(0);
   switch (c) {
   case 'D':
    System.out.printf("Enter deposit amount : ");
    Salary = scan.nextInt();
    i.deposit(Salary);
    System.out.println("Your Updated Amount : " + i.deposit(Salary));
    break;
   case 'W': 
    System.out.printf("Enter Withdrawn amount : ");
    Salary = scan.nextInt();
    i.withDrawl(Salary);
    System.out.println("Your Updated Amount is: " + i.withDrawl(Salary));
    break;
   case 'L':
    i.log();
   case 'E':
    System.out.println("Exit");
    break;
   default:
    System.out.println("Wrong Input!");
    break;
   }
   }while (c!='E');
   break;
  default:
   System.out.print("Oops! wrong entery ");
   break;
  }break;
 }while(option!=3);
 scan.close();
 }

}
