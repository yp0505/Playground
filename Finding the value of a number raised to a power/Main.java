import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      //while(base>exponent)
      
        //int result = base**exponent;
        System.out.println(Math.pow(base,exponent));
      
    }
}