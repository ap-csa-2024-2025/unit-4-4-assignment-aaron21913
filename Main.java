import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input String:");
        String inputString = scanner.nextLine();
      
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) == 'p' && vowels.indexOf(inputString.charAt(i + 1)) != -1) {
                count++;
            }
        }

        // Output the result
        System.out.println("Contains p followed by a vowel " + count + " times.");

      

  }
}
