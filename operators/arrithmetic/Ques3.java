package operators.arrithmetic;

public class Ques3 {
    public static void main(String[] args) {
        int price = 250;
        int quantity = 7;
        int discount = 300;

        int grossTotal = price * quantity;
        int finalPrice = grossTotal - discount;

        System.out.println("GROSS TOTAL : " + grossTotal);
        System.out.println("FINAL PRICE : " + finalPrice);
    }
}
