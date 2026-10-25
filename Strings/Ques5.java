// GIven String "Java Programming"
// Actions
// length of string
// character at index 5
// index of "gram"
//substring from index 5
// replace every 'a' with 'A'
//convert to uppper case
// compare with "java programming" with equals() and equalsIgnoreCase()


package Strings;

public class Ques5 {
    public static void main(String[] args) {
        String a = "Java Programming";
        System.out.println(a.length());
        System.out.println(a.charAt(5));
        System.out.println(a.indexOf("gram"));
        System.out.println(a.substring(5, a.length()));
        System.out.println(a.replace('a', 'A'));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.equals("java programming"));
        System.out.println(a.equalsIgnoreCase("java programming"));
        
    }
}
