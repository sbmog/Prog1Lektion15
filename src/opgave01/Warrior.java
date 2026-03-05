package opgave01;

import java.util.ArrayList;

public class Warrior extends Character {
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Warrior(String name, int level) {
        super(name, level);

    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
}
