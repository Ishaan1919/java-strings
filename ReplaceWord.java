import java.util.Scanner;

public class ReplaceWord{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = input.nextLine();
		
		System.out.print("Enter the word you want to replace in the string: ");
		String word = input.next();
		
		System.out.print("Enter the word you want to replace with: ");
		String newWord = input.next();
		
		String res = replaceWord(s,word,newWord);
		System.out.printf("String after replacement of %s with the %s is %s",word,newWord,res);
		input.close();
	}
	
	public static String replaceWord(String s, String word, String newWord){
		int len1 = s.length();
		int len2 = word.length();
		int len3 = newWord.length();
		
		String res = "";
		
		for(int i=0;i<len1;i++){
			if(s.substring(i,Math.min(len1,len2+i)).equals(word)){
				res+=newWord;
				i+=len2-1;
			}
			else{
				res += s.charAt(i);
			}
		}
		return res;
	}
}