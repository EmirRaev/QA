package boxes;

public class BoxShampoo extends Box{
    private static final String type = "Коробка с шампунем";
    private int shampooVolume;

    public String getType() {
        return type;
    }

    public int getShampooVolume() {
        return shampooVolume;
    }

    public void setShampooVolume(int shampooVolume) {
        this.shampooVolume = shampooVolume;
    }

    @Override
    public String typesVolumeString() {
        return shampooVolume+"ml";
    }

    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}
