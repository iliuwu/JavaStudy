package javabase;

import java.util.Map;

public class SimpleEntry<K,V> implements Map.Entry<K, V>,java.io.Serializable{

	private final K key;
	private V valueV;
	
	public SimpleEntry(K key, V valueV) {
		this.key = key;
		this.valueV = valueV;
	}
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	public V setValue(V arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Object object) {
		if (object == this)
		{
			return true;
		}
		if (object.getClass() == SimpleEntry.class)
		{
			SimpleEntry se = (SimpleEntry)object;
			return se.getKey().equals(getKey());
		}
		return false;
	}
	public int hashCode(){
		return key == null ? 0: key.hashCode();
	}
	
	@Override
	public String toString() {
		return "SimpleEntry [key=" + key + ", valueV=" + valueV + "]";
	}
	
	
}
