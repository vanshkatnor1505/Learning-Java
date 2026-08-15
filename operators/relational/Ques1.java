package operators.relational;

// Range Classification

// GIVEN :::  int temperature = 27;
// TO DO ::: determine whether the temperature is exactly at the boundary of a comfortable range.
// COMFORTABLE RANGE ::: 18 through 27

// EXPECTED OUTPUT :::
// belowComfort = false
// comfortable  = true
// aboveComfort = false

public class Ques1 {
    public static void main(String[] args) {
        int temperature = 27;
        boolean belowComfort = false;
        boolean comfortable = false;
        boolean aboveComfort = false;

        if (temperature > 27) {
            aboveComfort = true;
        }
        if (temperature < 18) {
            belowComfort = true;
        }
        if(temperature >= 18 && temperature <= 27){
            comfortable = true;
        }

        System.out.println("BELOW COMFORT      : " + belowComfort);
        System.out.println("COMFORTABLE        : " + comfortable);
        System.out.println("ABOVE COMFORTABLE  : " + aboveComfort);
    }
}
