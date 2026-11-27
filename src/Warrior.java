public class Warrior extends Hero {
    public Warrior(String Name, int Hp, int Damage, Weapon currentWeapon) {
        super(Name, Hp+= 30, Damage-=10, currentWeapon);
    }
}
