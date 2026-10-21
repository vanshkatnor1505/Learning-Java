// Example of abstract class

package OOPS;

abstract class InnerQues3 {
    abstract void inner();
    
} 

class Ques3 extends InnerQues3 {
    void inner(){
        System.out.println("This is acessed using Abstarct class");
    }

    public static void main(String[] args) {
        Ques3 q3 = new Ques3();
        q3.inner();
    }
}
