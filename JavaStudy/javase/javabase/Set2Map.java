package javabase;

import java.util.HashSet;

public class Set2Map <K,V> extends HashSet<SimpleEntry<K, V>>{
	public void clear() {
		super.clear();
	}
	public boolean containsKey(Object key) {
		
		return super.contains(new SimpleEntry<K, V>((K) key, null));
	}
	
	boolean containsValue(Object value){
		for ( SimpleEntry<K, V> seEntry :this)
		{
			if (seEntry.getValue().equals(value))
				return true;
		}
		return false;
	}
	public V get(Object key) {
		for ( SimpleEntry<K, V> seEntry :this)
		{
			if (seEntry.getValue().equals(key))
				return seEntry.getValue();
		}
		return null;
	}
	public V put(K keyk,V valueV) {
		add(new SimpleEntry<K,V>(keyk, valueV));
		return valueV;
	}
	
	
}
