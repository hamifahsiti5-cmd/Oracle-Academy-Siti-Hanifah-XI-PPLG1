import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "parliament";
        String str2 = "partial men";

        boolean result = isAnagram(str1, str2);
        
        System.out.println("Apakah \"" + str1 + "\" anagram dari \"" + str2 + "\"? " + result);
    }

    public static boolean isAnagram(String s1, String s2) {
        // Membersihkan string dari spasi/tanda baca dan mengubah ke huruf kecil
        String clean1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (clean1.length() != clean2.length()) {
            return false;
        }

        char[] charArray1 = clean1.toCharArray();
        char[] charArray2 = clean2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}