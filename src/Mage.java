public class Mage extends Hero {
    public Mage(String Name, int Hp, int Damage, Weapon currentWeapon) {
        super(Name, Hp-= 10, Damage+=10, currentWeapon);
    }

}