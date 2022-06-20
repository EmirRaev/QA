package boxes;

public class BoxSoap extends Box {
    private static final String type = "Коробка с мылом";
    private int weight;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String typesVolumeString() {
        return weight+"гр";
    }

    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}
