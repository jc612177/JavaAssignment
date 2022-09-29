package java2;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class SBI extends Banks {
 Banks b = new Banks();
 int withdrawn=0;
 int dep=0;
 int money1;
 int prev_transaction;
 String tran_Status;
 
 int deposit(int money) {
  dep=b.getsalary()+money;
  return dep;
 }
 int withDrawl(int money) {
  withdrawn=dep-money;
  money1=money;
  try {
  if(withdrawn<0) {
   System.out.println("Deposit can not be negative..");
   tran_Status="TRANSACTION FAIL!";
   return withdrawn;
  }else {
   tran_Status="TRANSACTION PASS!";
   return withdrawn;
  }
  }catch(Exception e) {
  System.out.println(e.getMessage());
  System.out.println("TRANSACTION FAILURE!!");
  }
  return 0;
 }
 void log() {
  System.out.println("Time of transaction : ");
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
  LocalDateTime now = LocalDateTime.now();
  System.out.println(dtf.format(now));
  System.out.println("User Account Number: "+b.getAccountNo());
  
  System.out.println("Amount withdrawn: "+money1);
  System.out.println("Amount before withdrawn: "+dep);
  System.out.println("Amount After withdrawn: "+withdrawn);
  System.out.println("Amount After withdrawn: "+tran_Status);
 }
 void exit() {
  System.exit(0);
 }

 }

