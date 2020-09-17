
import org.junit.Test;

import java.util.TreeMap;

public class Solution {

    private class Freq implements Comparable<Freq>{
        public int e, freq;

        public Freq(int e,int freq){
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq o) {
            if (this.freq < o.freq)
                return 1;
            else if (this.freq > o.freq)
                return -1;

            else
                return 0;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>();

        for (int key : map.keySet()) {
            if (pq.getSize() < k) {
                pq.enqueue(new Freq(key,map.get(key)));
            }
            else if (map.get(key) > pq.getFront().freq) {
                pq.dequeue();
                pq.enqueue(new Freq(key, map.get(key)));
            }
        }
        int[] res = new int[k];
        if (!pq.isEmpty()){
            for (int i = 0; i < res.length; i++) {
                res[i] = pq.dequeue().e;
            }
        }
        return res;
    }

    @Test
    public void test() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ints = topKFrequent(nums, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
