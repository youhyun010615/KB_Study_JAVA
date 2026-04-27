package generic.ex3;

public class Pair<T, K> {
    private T value;
    private K key;

    public Pair(T value, K key) {
        this.value = value;
        this.key = key;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value=" + value +
                ", key=" + key +
                '}';
    }
}
