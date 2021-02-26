/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.generator;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner; 

/** 12/18/2020
 * A program that will generate a random password.
 * 
 * @author Henry Trinh
 */
public class PasswordGenerator {
    //Alaphbet of the passowrd
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Password Generator");
    do{
        System.out.print("Please input a length or enter 0 to quit: ");
        int input = sc.nextInt();  
        if ( input == 0) { 
        
        break;
        } else {
           System.out.println();
           System.out.println("------------------------------------------");
           System.out.println("Password: " + generatePassword(input));
           System.out.println("------------------------------------------");
           System.out.println();
        }
    } while(true); // and keep repeating
          
        
    }
    
    private static String generatePassword(int length) {
         // Argument Validation.
        if (length <= 0) {
            return "That is not possible";
        }
        
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        //Alphabet could be anything 
        String set = LOWER + UPPER + DIGITS + PUNCTUATION;

        for (int i= 0; i < length; i++) {
            int k = random.nextInt(set.length());
            char randomChar = set.charAt(k);
            
            sb.append(randomChar);
            
        }
        String result = sb.toString();
        return result;
    }
    
}
