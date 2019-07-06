import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      n = (n%10)+(n/100);
      System.out.println(n);
	}
}