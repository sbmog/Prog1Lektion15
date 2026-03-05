package opgave01;

import opgave01.models.Duration;

public class Main {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Fofstelr", 100);
        Weapon longsword = new Weapon("Longsword");
        Weapon shortbow = new Ranged("shortbow", 80);
        barbarian.addWeapon(longsword);
        barbarian.addWeapon(shortbow);

        Wizard wizard = new Wizard("Orlemaex", 10);
        wizard.spells.add(new Spell("fireballs", 150, Duration.INSTANTANEOUS));

        for (Weapon weapon : barbarian.weapons) {
            System.out.println(weapon.getName());
            if (weapon instanceof Ranged){
                System.out.println(((Ranged) weapon).getRange());
            }
        }

    }
}

