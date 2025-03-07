import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();

        String[][] frequencies = findCharacterFrequencies(text);
        System.out.println("Character Frequencies:");
        for (String[] row : frequencies) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    public static String[][] findCharacterFrequenciesUsingNestedLoop(String text) {
        char[] characters = text.toCharArray();
        int len = characters.length;
        int[] frequency = new int[len];

        for (int i = 0; i < len; i++) {
            if (characters[i] == '0') continue;
            frequency[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (characters[i] != '0') uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (characters[i] != '0') {
                result[index][0] = Character.toString(characters[i]);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }
        
        return result;
    }

    public static String[][] findCharacterFrequencies(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        int uniqueCount = uniqueChars.length;

        String[][] result = new String[uniqueCount][2];
        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        
        return result;
    }
}
