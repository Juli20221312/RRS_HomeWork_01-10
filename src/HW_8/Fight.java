package HW_8;

public class Fight {

        public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            Fighter first = firstAttacker.equals(fighter1.getName()) ? fighter1 : fighter2;
            Fighter second = first == fighter1 ? fighter2 : fighter1;

            while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
                first.attack(second);
                if (second.getHealth() <= 0) {
                    return first.getName();
                }
                second.attack(first);
                if (first.health <= 0) {
                    return second.name;
                }
            }
            return null;
        }



        public static void main(String[] args) {
            Fighter fighter1 = new Fighter("Fighter1", 10, 2);
            Fighter fighter2 = new Fighter("Fighter2", 5, 4);

            String winner = declareWinner(fighter1, fighter2, "Fighter1");
            System.out.println("Winner: " + winner);
        }



}

