package opgave01;

public class Ranged extends Weapon {
    private int range;

    public Ranged(String name, int range) {
        super(name);
        this.range = range;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getRange() {
        return range;
    }
}
