import java.util.Scanner;

public class AnagramStrings{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string 1: ");
        String s1 = input.next();
        
        System.out.print("Enter string 2: ");
        String s2 = input.next();

        boolean res = checkAnagram(s1,s2);

        if(res){
            System.out.println("The strings are anagram strings");
        }
        else{
            System.out.println("The strings are not anagram strings");
        }
        input.close();
    }
    public static boolean checkAnagram(String s, String t){
        int len1 = s.length();
        int len2 = t.length();
        int[] freq = new int[26];
        if(len1!=len2) return false;
        for(int i=0;i<len1;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
            c = t.charAt(i);
            freq[c-'a']--;
        }
        for(int i:freq){
            if(i != 0) return false;
        }
        return true;
    }
}