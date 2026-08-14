package operators.arrithmetic;

public class Ques4 {
    public static void main(String[] args) {
        int ticketPrice     = 250;
        int ticketsSold     = 8;
        int snackRevenue    = 1200;
        int staffCost       = 500;

        int ticketRevenue = ticketPrice * ticketsSold;
        int totalRevenue = ticketRevenue + snackRevenue;
        int profit = totalRevenue - staffCost;
        int averageRevenue = totalRevenue / ticketsSold;
        

        System.out.println("TICKET REVENUE  : " + ticketRevenue);
        System.out.println("TOTAL REVENUE   : " + totalRevenue);
        System.out.println("PROFIT          : " + profit);
        System.out.println("AVERAGE REVENUE : " + averageRevenue);

    }
}