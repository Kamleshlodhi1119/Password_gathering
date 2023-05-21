 // crack the password
// this is only study purpose
// created by kamleshlodhi1119
// firstly enter only uperrcase 3 latter
import java.util.Random;
import java.util.Scanner;

public class PasswrdCrck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        boolean match = false;
        while (!match) {
            int length = generateRandomLength();
            String generatedPassword = generatePassword(length);
            System.out.println("Generated Password: " + generatedPassword);

            if (userInput.equals(generatedPassword)) {
                System.out.println("Password matched! Successful!");
                match = true;
            } else {
                System.out.println("Password does not match. Generating a new password...");
            }
        }
    }

    static int generateRandomLength() {
        Random rnd = new Random();
        //if you want to select Random  size of password length 
        return 3;// rnd.nextInt(14) + 1;
    }

    static String generatePassword(int len) {
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // if you want to include the all special character & soecial symbol but the time is take to more to crack the password which include all symbols
     //   String chars = "abcdefghijklmnopqrstuvwxyz";
    //    String nums = "0123456789";
   //     String symbols = "!@#$%^&*_=+-/~`£€¢℅∆×÷πΠ♣♠♥♦♪•≈≠∞‰±—–·_,.";

        String passSymbols = charsCaps ;//+ chars + nums + symbols;
        // add the all symbol and lowecase latter
        Random rnd = new Random();

        StringBuilder password = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            password.append(passSymbols.charAt(rnd.nextInt(passSymbols.length())));
        }
        // return password 
        return password.toString();
    }
}
