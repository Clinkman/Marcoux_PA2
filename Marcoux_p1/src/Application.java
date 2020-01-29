import java.util.Scanner;

public class Application extends Encryptyer {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a 4 digit integer:");
	       String number = sc.nextLine();
	       String encryptedNumber = encrypt(number);
	       System.out.println("The decrypted number is:"+encryptedNumber);
	       System.out.println("The original number is:"+decrypt(encryptedNumber));
	      
	   }
}
