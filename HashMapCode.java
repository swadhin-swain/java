import java.util.*;

import javax.management.loading.PrivateClassLoader;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;// n
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }


        private int hashFunction(K key) {
            return 0;
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
        }

        public boolean containsKey(K key) {
            return false;
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
