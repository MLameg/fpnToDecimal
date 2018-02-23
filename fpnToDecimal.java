//********************************************************
// Name: Monti Lameg                Homework 1: Prob. 1
//
// Convert 32-bit FPN to decimal equivalent
//********************************************************
import java.util.Scanner;

public class FPNtoDecimal
{
   public static void main(String[] args)
   {
      // Uses FPN example provided
      String exexp = "10000010";
      String exman = "00100000000000000000000";
      int exexp1 = Integer.parseInt(exexp, 2);
      exexp1 = exexp1 - 127;
      double exman1 = Double.parseDouble(exman);
      double expow = Math.pow(10, -23);
      double expow2 = expow * exman1;
      double exnorm = 1 + expow2;
      double exstep4 = Math.pow(10, exexp1);
      double exnorm1 = exstep4*exnorm;
      int exres = (int)Math.round(exnorm1);
      String exfpn = Integer.toString(exres);
      System.out.println("1 10000010 00100000000000000000000 is equal to:");
      System.out.println("-"+Integer.parseInt(exfpn,2));
      
      // Scanner that stores user input into an int
      Scanner scan = new Scanner(System.in);     
      System.out.println("Please enter the SIGN.");
      int sign = scan.nextInt();
      
      // Scanner that stores user input and calculates exponent
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Please enter the EXPONENT (8 bits).");
      String exp = scan2.nextLine();
      int exp1 = Integer.parseInt(exp, 2);
      exp1 = exp1 - 127;
       
      // Scanner that stores user input  
      Scanner scan3 = new Scanner(System.in);
      System.out.println("Please enter the MANTISSA (23 bits).");
      String man = scan3.nextLine();
      double man1 = Double.parseDouble(man);
      
      // Normalization
      double pow = Math.pow(10, -23);
      double pow2 = pow * man1;
      double norm = 1 + pow2;
      double step4 = Math.pow(10, exp1);
      double norm1 = step4*norm;
      int res = (int)Math.round(norm1);
      String fpn = Integer.toString(res);
         
      // Converts into decimal equivalent and prints "-" if sign = 1
      if(sign == 1)
         System.out.println("Output: -"+Integer.parseInt(fpn,2));
      if(sign == 0)
         System.out.println("Output: "+Integer.parseInt(fpn,2));
   }
}