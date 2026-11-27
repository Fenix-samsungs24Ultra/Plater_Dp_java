public class Weapon {
    public String name;
    private int damage;
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
       if(damage > 0){
              this.damage = damage;
       }else {
              System.out.println("Damage must be greater than 0");
              this.damage = 0;
       }
    }public Weapon(String name, int damage){
        this.name = name;
        setDamage(damage);
    }

}
