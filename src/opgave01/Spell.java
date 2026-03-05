package opgave01;

import opgave01.models.Duration;

public class Spell {
    private String name;
    private int range;
    private Duration duration;

    public Spell(String name,int range, Duration duration) {
        this.name=name;
        this.range = range;
        this.duration = duration;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
