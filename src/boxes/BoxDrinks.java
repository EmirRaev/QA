package boxes;

public class BoxDrinks extends Box{
    private static final String type ="Блок с напитком";
    private int bottleVolume;

    public String getType() {
        return type;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(int bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String typesVolumeString() {
        return bottleVolume+"л";
    }
    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}
