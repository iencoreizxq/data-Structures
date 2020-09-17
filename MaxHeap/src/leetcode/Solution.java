package leetcode;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution {

    private class Freq {
        public int e, freq;

        public Freq(int e,int freq){
            this.e = e;
            this.freq = freq;
        }

    }

    private class FreqComparator implements Comparator<Freq> {
        @Override
        public int compare(Freq a, Freq b) {
            return a.freq - b.freq;
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

        PriorityQueue<Freq> pq = new PriorityQueue<>(new FreqComparator());

        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(new Freq(key,map.get(key)));
            }
            else if (map.get(key) > pq.peek().freq) {
                pq.remove();
                pq.add(new Freq(key, map.get(key)));
            }
        }
        int[] res = new int[k];
        if (!pq.isEmpty()){
            for (int i = 0; i < res.length; i++) {
                res[i] = pq.remove().e;
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
