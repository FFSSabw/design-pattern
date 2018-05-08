package observer;

public class Data {
    private int value;
    
    public Data(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("%d", value);
    }
}
