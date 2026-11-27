public class Hero {
public String name;
private int damage;
public int getDamage() {
return  damage;
}public void setDamage(int damage) {
    if (damage < 0 || damage > 100) {
        System.out.println("Damage must be between 0 and 100");
        this.damage = 0;
    } else {
this.damage = damage;
    }
    }
private int hp;
public int getHp() {
    return hp;
}public void setHp(int hp) {
        if (hp <= 0) {
            System.out.println("Hero is dead");
            this.hp = 0;
        } else {
        this.hp = hp;
        }
    }public Weapon currentWeapon;
public Weapon getCurrentWeapon() {
    return currentWeapon;
}public void setCurrentWeapon(Weapon currentWeapon) {
    this.currentWeapon = currentWeapon;
    }
    public Hero(String Name, int Hp, int Damage, Weapon currentWeapon)  {
       this.name = Name;
       this.hp = Hp;
       this.damage = Damage;
        this.currentWeapon = currentWeapon;
    }public void attack(Hero target) {
        int totalDamage = this.damage + this.currentWeapon.getDamage();
        target.setHp(target.getHp() - totalDamage);
        System.out.println(this.name + " attacks " + target.name + " with " + this.currentWeapon.name + " for " + totalDamage + " damage.");
    }
}

