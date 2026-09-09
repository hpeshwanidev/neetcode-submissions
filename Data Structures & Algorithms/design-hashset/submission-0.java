class MyHashSet {
    private List<List<Integer>> buckets;

    public MyHashSet() {
        buckets=new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            buckets.add(new ArrayList<>());
        }

    }
    
    public void add(int key) {
        int bucketidx = key % 10000;
        List<Integer> bucket = buckets.get(bucketidx);
        if (!bucket.contains(key)){
            bucket.add(key);
        }

    }
    
    public void remove(int key) {
        int bucketidx = key % 10000;
        List<Integer> bucket = buckets.get(bucketidx);
        if (bucket.contains(key)){
        bucket.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int bucketidx = key % 10000;
        List<Integer> bucket = buckets.get(bucketidx);
        if (bucket.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */