/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathstuff;

/**
 *
 * @author somebody
 */
public class GreatestCommonDivisor 
{
    public static void main(String [] args)
    {
        //long a = 325230092300L;
        //long b = 2567888L;
        long a = 0;
        long b = 0;
        long remainder = 0;
        long divisor = 0;
        long gcd = 0;
        long dividend = 0;
        
        for (String s: args) 
        {
            System.out.println(s);
        }
        if (args.length < 2)
        {
           a = 325230092300L;
           b = 2567888L;
           System.out.println("Not enough args set a="+a+" and b="+b);
        }
        else 
        {
            a = Long.parseLong(args[0]);
            b = Long.parseLong(args[1]);
        }
        
        if (a > b)
        {
            remainder = a % b;            
            System.out.println("divisor is: "+b+" dividend is: "+a+" remainder is: "+remainder);
            divisor = remainder;
            dividend = b;
        }
        else if (a == b)
        {
            System.out.println("GCD of "+a+" and "+b+" is "+a);
            return;
        }
        else
        {
            remainder = b % a;
            System.out.println("divisor is: "+b+" dividend is: "+a+" remainder is: "+remainder);
            divisor = remainder;
            dividend = a;  
        }
        do
        {
          remainder = dividend % divisor;
          System.out.println("divisor is: "+divisor+" dividend is: "+dividend+" remainder is: "+remainder);
          if (remainder <= 0)
          {
              System.out.println("GCD of "+a+" and "+b+" is "+divisor);
          }
          dividend = divisor;
          divisor = remainder;
        } while (remainder > 0);
 
    }

}
