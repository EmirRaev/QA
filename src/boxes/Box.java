package boxes;

abstract public class Box {
    private String type;
    private String name;
    private int volume;

    public abstract String typesVolumeString();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "|" + name + '|' + "|" + volume + '|';
    }
}
