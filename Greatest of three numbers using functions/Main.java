import java.util.Scanner;
class Main{
  public static int greatest(int n1,int n2,int n3)
  {
    if(n1>n2 && n1 >n3)
    {
      return n1;
    }
    else if(n2>n1 && n2>n3)
    {
      return n2;
    }
    else
    {
      return n3;
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int m1 = sc.nextInt();
      int m2 = sc.nextInt();
      int m3 = sc.nextInt();
      int great = greatest(m1,m2,m3);
      System.out.print(great);
	}
}