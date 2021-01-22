
class Entry<K, V>
  {
     K key;
     V value;
     Entry<K, V> next;
    
    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }
    
    public K getKey() {
      return this.key;
    }
    
    public V getValue() {
      return this.value;
    }
    
    public void setValue(V value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      Entry<K,V> temp = this;
      StringBuilder sb = new StringBuilder();
      while (temp != null) {
        sb.append(temp.key + " -> " + temp.value + ",");
        temp = temp.next;
      }      
      return sb.toString();
    }
    
  }