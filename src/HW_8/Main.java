package HW_8;

public class Main {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Check who attacks first
        Fighter attacker = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = fighter1.name.equals(firstAttacker) ? fighter2 : fighter1;

        // Simulate the fight
        while (fighter1.health > 0 && fighter2.health > 0) {
            // Attacker attacks defender
            defender.health -= attacker.damagePerAttack;

            // Swap roles for next turn
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Determine the winner
        return (fighter1.health <= 0) ? fighter2.name : fighter1.name;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        String firstAttacker = "Lew";

        String winner = declareWinner(fighter1, fighter2, firstAttacker);
        System.out.println("Winner: " + winner);
    }


}
