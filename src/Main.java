public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 10);
        Weapon staff = new Weapon("Staff", 15);
        Weapon bow = new Weapon("Bow", 20);

        Hero mage = new Mage("Alice", 100, 20, staff);
        Hero warrior = new Warrior("Bob", 150, 30, sword);
        Hero archer = new Archer("Charlie", 120, 25, bow);

        mage.attack(warrior);
        warrior.attack(archer);
        archer.attack(mage);
    }
}