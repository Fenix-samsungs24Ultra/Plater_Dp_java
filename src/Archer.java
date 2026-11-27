public class Archer extends Hero {
    public Archer(String Name, int Hp, int Damage, Weapon currentWeapon) {
        super(Name, Hp+= 20, Damage-=5, currentWeapon);
    }
}