import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountVowelsConsonants {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }

        Set<Character> vowels = new HashSet<>(
                Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        int vowelCount = 0;
        int consonantCount = 0;

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (vowels.contains(c))
                        vowelCount++;
                    else
                        consonantCount++;
                }
            }
        }
        fileScanner.close();

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
