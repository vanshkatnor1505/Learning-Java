package operators.assignment;

// Resource Management

// GIVEN :::
// A game character starts with:

// int health = 100;
// int energy = 80;
// int coins = 500;

// During a sequence of events:

// Taking damage: 35 health
// Using an ability: consumes 25 energy
// Finding treasure: +250 coins
// Resting: restores 20 health
// Buying an item: costs 300 coins
// Using another ability: consumes half of the current energy
// Finding a bonus: coins increase by the remainder of current coins divided by 7

// EXPECTED OUTPUT :
// Health  : ?
// Energy  : ?
// Coins   : ?

public class Ques5 {
    public static void main(String[] args) {
        int health = 100;
        int energy = 80;
        int coins = 500;

        health -= 35;
        energy -= 25;
        coins += 250;
        health += 20;
        coins -= 300;
        energy /= 2;
        coins += coins%7;

        System.out.println("HEALTH : " + health);
        System.out.println("ENERGY : " + energy);
        System.out.println("COINS : " + coins);
        
    }
}
