 import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		String userInput;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your string");
            userInput = sc.next();
            
           // System.out.println("Else  Enter your string");
			if(userInput.equals("XDONE")) {
				break;
			 }
             System.out.println("Want to close write :XDONE !! Else ");
		}
		sc.close();
	}

}
