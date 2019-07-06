import java.util.Scanner;
class Main{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = reverse(str).split(" ");
		String reverseString = "";
		for(int i = 0; i < words.length; i++) {
			reverseString += reverse(words[i]) + " ";
		}
		System.out.println(reverseString.trim());
	 }
	 
	 public static String reverse(String word) {
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;	
	 }
}