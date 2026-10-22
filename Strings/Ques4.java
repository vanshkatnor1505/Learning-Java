// use string buffer to "Hello" to perform actions
// append "World"
//  insert "Java" at index 6
// reverse the buffer
// delete the characters from index 0 to 4
// print the result

package Strings;

public class Ques4 {
    
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Hello");
        
        System.out.println(a.append(" World"));
        System.out.println(a.insert(6, " Java "));
        System.out.println(a.reverse());
        System.out.println(a.delete(0, 4));

    }
}
