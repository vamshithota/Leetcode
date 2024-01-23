package practice;

import java.util.LinkedList;

public class HashMapInternalImplementation<K,V> {
    // Create internal implementation of hashmap
    // Create methods put,get, remove, containsKeys, reHash
    private Entry<K,V>[] table;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size =0;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public HashMapInternalImplementation(){
        this.table = new Entry[DEFAULT_INITIAL_CAPACITY];
        this.size = 0;
    }
    // implementing put
    public void put(K key, V value) {
        int hash = hash(key);
        int index = hash % table.length;
        if (table[index] == null) {
            table[index] = new Entry(key, value);
        } else {
            Entry<K, V> entry = table[index];
            while (entry.next != null && !entry.key.equals(key)) {
                entry = entry.next;
            }
            if (entry.key.equals(key)) {
                entry.value = value;
            } else {
                entry.next = new Entry<>(key, value);
                size++;
            }
        }

        if (size > table.length * DEFAULT_LOAD_FACTOR) {
            reSizeAndReHash();
        }

        size++;
    }

    private void reSizeAndReHash() {
        int newCapacity = table.length * 2; // Double the capacity for simplicity
        Entry<K,V>[] newTable = new Entry[newCapacity];
        // Rehash all existing key-value pairs into the new array
        for(Entry<K,V> entry: table) {
            while (entry != null) {
                int newIndex = hash(entry.key) % newCapacity;
                Entry<K, V> next = entry.next;
                entry.next = newTable[newIndex];
                newTable[newIndex] = entry;
                entry = next;
            }
        }
        table = newTable;
    }

    public V get(K key){
        int hash = hash(key);
        int index =  hash % table.length;
        Entry<K, V> entry = table[index];
        while(entry!=null){
            if(entry.key.equals(key)){
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }
    public boolean containsKey(K key) {
        int hash = hash(key);
        int index = hash % table.length;

        Entry<K, V> entry = table[index];
        while(entry!= null){
            if(entry.key.equals(key)){
                return true;
            }
            entry = entry.next;
        }

        return false;
    }

    public V remove(K key){
        int hash = hash(key);
        int index = hash % table.length;

        Entry<K,V> entry = table[index];
        Entry<K,V> prev = null;

        while(entry != null){
            if(entry.key.equals(key)){
                if(prev == null){
                    table[index] = entry.next; // Update the head of the linked list
                }else{
                    prev.next = entry.next;  // Remove the entry from the linked list
                }
                size--;
                return entry.value;
            }
            prev = entry;
            entry = entry.next;
        }
        return null; // Key not found
    }
    private int hash(K key) {
        int h;
        return (key == null) ? 0 : ((h = key.hashCode()) ^ (h >>> 16));
    }
    private class Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

}


