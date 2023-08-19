public class Player {
    private int _health;
    private int _damage;
    private int _armor;

    public Player(int health, int damage, int armor) {
        if(health < 0){
            this._health = 0;
        } else if(health > 100){
            this._health = 100;
        } else {
            this._health = health;
        }
        _damage = damage;
        _armor = armor;
    }
}
