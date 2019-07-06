import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int str_len = str.length();
      StringBuilder sb = new StringBuilder(str);
      char front =str.charAt(0);
      char end = str.charAt(str_len-1);
      boolean pal = false;
      for(int i =0;i<str_len;i++)
      {
        
        if(front==end)
        {
          pal = true;
         // int pali = pal;
        }
      }
      if(pal == true)
      {
        System.out.println("Yes");
        
      }
      else
      {
        System.out.println("No");
      }
        
    } 
}