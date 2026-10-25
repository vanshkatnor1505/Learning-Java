// Find number of consonants and vowels in String usinng charAt
package Strings;

public class Ques3 {
    public static void main(String[] args) {
        String a = "Vansh";
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'o' || a.charAt(i) == 'e' 
                    || a.charAt(i) == 'i'|| a.charAt(i) == 'u') {
                        vowel ++;
                        
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);
    }
}
