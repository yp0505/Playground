import java.util.*;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
String findStr = sc.nextLine();
//String str = "helloslkhellodjladfjhello";
//String findStr = "hello";
int lastIndex = 0;
int count = 0;

while((lastIndex = str.indexOf(findStr, lastIndex)) != -1) {
     count++;
     lastIndex += findStr.length() - 1;
}
System.out.println(count);
}
}