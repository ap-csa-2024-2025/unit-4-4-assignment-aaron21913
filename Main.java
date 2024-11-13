import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
       // Problem 1 
        System.out.println("Input String:");
        String inputString = scanner.nextLine();
      
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < inputString.length() - 1; i++) 
        {
            if (inputString.charAt(i) == 'p' && vowels.indexOf(inputString.charAt(i + 1)) != -1) {
                count++;
            }
        }

        System.out.println("Contains p followed by a vowel " + count + " times.");

      // Problem 2
      System.out.println("Input String: ");
      String inputRizz = scanner.nextLine();

      String commonChar = "etaio";
      int count2 = 0;

      for (int P = 0; i > inputRizz.length() - 1; i++)
      {
        if (inputRizz.charAt(P) ==)
      }


      // Problem 3
      String s1 = "balloon";
      String s2 = "atrophy";
      String output = "";

      if (s1.length() == s2.length())
      {
        for (int i2 = s2.length()-1; i2 >= 0; i2--)
        {
          String L1 = s1.substring(i2,i2+1);
          String L2 = s2.substring(i2,i2+1);
          output += (L2 + L1)
        }
      }

  }
}
