class MyHashMap {
    private List<List<Pair>> buckets;

    public MyHashMap() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        int bucketidx = key % 10000;
        List<Pair> bucket = buckets.get(bucketidx);

        boolean found = false;
        for (Pair pair : bucket) {
            if (pair.key == key) {
                pair.value = value; // update value
                found = true;
                break;
            }
        }
        if (!found) {
            bucket.add(new Pair(key, value)); // add new pair
        }
    }

    public int get(int key) {
        int bucketidx = key % 10000;
        List<Pair> bucket = buckets.get(bucketidx);

        for (Pair pair : bucket) {
            if (pair.key == key) return pair.value;
        }
        return -1;
    }

    public void remove(int key) {
        int bucketidx = key % 10000;
        List<Pair> bucket = buckets.get(bucketidx);

        Iterator<Pair> it = bucket.iterator();
        while (it.hasNext()) {
            Pair pair = it.next();
            if (pair.key == key) {
                it.remove();
                break;
            }
        }
    }
}

class Pair {
    int key;
    int value;
    Pair(int k, int v) { key = k; value = v; }
}
