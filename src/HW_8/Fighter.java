package HW_8;
// Создайте функцию, которая возвращает имя победителя в бою между двумя бойцами.
//
//Каждый боец по очереди атакует другого, и тот, кто убьет другого первым, становится победителем. Смерть определяется как наличие здоровья <= 0.
//
//Каждый боец будет объектом/экземпляром Fighter. Смотрите класс истребителя ниже на выбранном вами языке.
//
//Как здоровье, так и урон за атаку (damage_per_attack для python) будут целыми числами, большими 0. Вы можете изменять объекты истребителя.
//
//Ваша функция также получает третий аргумент, строку, с именем бойца, который атакует первым.
// Пример : declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
//
//  Lew attacks Harry; Harry now has 3 health.
//  Harry attacks Lew; Lew now has 6 health.
//  Lew attacks Harry; Harry now has 1 health.
//  Harry attacks Lew; Lew now has 2 health.
//  Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.

// public class Fighter {
//  public String name;
//  public int health, damagePerAttack;
//  public Fighter(String name, int health, int damagePerAttack) {
//    this.name = name;
//    this.health = health;
//    this.damagePerAttack = damagePerAttack;
//  }
//}

public class Fighter {

        String name;
        int health;
        int damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getDamagePerAttack() {
            return damagePerAttack;
        }

        public void attack(Fighter opponent) {
            opponent.setHealth(opponent.getHealth() - this.damagePerAttack);
        }

    // второй вариант + main
//    public String name;
//    public int health, damagePerAttack;
//
//    public Fighter(String name, int health, int damagePerAttack) {
//        this.name = name;
//        this.health = health;
//        this.damagePerAttack = damagePerAttack;
//    }

}

