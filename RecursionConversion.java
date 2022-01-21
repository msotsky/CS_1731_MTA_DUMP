/*
Maxime Sotsky 0270251
Data Structures and Algorithms I
2019-09-04
Write a recursive method that converts a positive decimal number to a binary number.
*/
public class RecursionConversion
{
    public static void main(String[] args)
    {   
        System.out.println("0.02");
        System.out.println("0." +recCon(0.02));
        binary = "";
        System.out.println("0.25");
        System.out.println("0." +recCon(0.25));
        binary = "";
        System.out.println("0.325");
        System.out.println("0." +recCon(0.325));
        binary = "";
        System.out.println("0.75");
        System.out.println("0." +recCon(0.75));

    }
    public static String binary = "";
    public static int count = 0;

    public static String recCon(double decimal)
    {
       //need to keep multiplying the decimal by 2 until it reaches 0
       if (decimal == 0.0 || decimal < 0.0)
       {
           return binary;
       }
       else{
            decimal= (decimal * 2);
            if (decimal>= 1 )
            {
                binary = binary + "1";
                if (decimal> 0.0)
                {
                 recCon(decimal% 1);
                 count++;
                }
            }
            if (decimal < 1)
            {
                binary = binary + "0";
                if (decimal> 0.0)
                {
                 recCon(decimal);
                 count++;
                }
            }
       }
       return binary;
    }

}