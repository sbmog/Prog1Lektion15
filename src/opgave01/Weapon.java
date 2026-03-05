package opgave01;

public class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
