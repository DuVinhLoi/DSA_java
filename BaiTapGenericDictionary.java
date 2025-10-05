public class BaiTapGenericDictionary<K, V> {
    private K key;

    private V value;

    BaiTapGenericDictionary<String, String> dict = new BaiTapGenericDictionary<String, String>();

    public BaiTapGenericDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public BaiTapGenericDictionary() {
        
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }



    public String toString() {
        return "BaiTapGenericDictionary{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
