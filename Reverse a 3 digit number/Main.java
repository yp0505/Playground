import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1=n%10;
    int n2=n/10%10;
    int n3=n/100;
    int reverse=(n1*100)+(n2*10)+(n3);
    System.out.println(reverse);
  }
}